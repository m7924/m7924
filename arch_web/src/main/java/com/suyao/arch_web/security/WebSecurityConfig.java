package com.suyao.arch_web.security;


import com.suyao.arch_web.security.filter.JwtLoginFilter;
import com.suyao.arch_web.security.filter.JwtVerifyFilter;
import com.suyao.arch_web.security.service.UserService;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * WebSecurityConfigurerAdapter：自定义Security策略
 * AuthenticationManagerBuilder：自定义认证策略
 * @EnableWebSecurity：开启WebSecurity模式
 *
 * @author Robod
 * @date 2020/8/9 15:47
 */
@SpringBootConfiguration
@EnableWebSecurity      //加了这个注解才能写SpringSecurity相关的配置
@EnableGlobalMethodSecurity(securedEnabled = true)  //开启权限控制的注解支持,securedEnabled表示SpringSecurity内部的权限控制注解开关
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserService userService;

    private final RsaKeyProperties rsaKeyProperties;

    public WebSecurityConfig(UserService userService, RsaKeyProperties rsaKeyProperties) {
        this.userService = userService;
        this.rsaKeyProperties = rsaKeyProperties;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 认证用户的来源
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //数据库中
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }



    /**
     * 配置SpringSecurity相关信息
     *
     * @param http
     * @throws Exception
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .headers()
                    .frameOptions().disable()//配置允许嵌入iframe
                    .and()
                .csrf()
                    .disable()  //关闭csrf (跨站请求伪造)
                .authorizeRequests()//配置权限
                    .antMatchers(HttpMethod.GET,"/**/*.html", "/js/**","/css/**","/fonts/**","/images/**","/copyrigth_img.png").permitAll()//放行 不去做验证是否可以访问（UsernamePasswordAuthenticationToken），但还是会经过过滤器
                    .antMatchers("/initPlugin", "/cityVedio2").permitAll()
                    .antMatchers("/**").hasAnyRole("USER") //设置统一的 URL 的权限校验，只判断是否为登陆用户。另外，#hasAnyRole(...) 方法，会自动添加 "ROLE_" 前缀，所以此处的传参是 "user"
                    .anyRequest().authenticated()    //表示其它资源需要认证通过后才可访问
                    .and()
                .formLogin()//开启formLogin默认配置
                    .loginPage("/login/auth").permitAll()//请求时未登录跳转接口（permitAll允许任何人请求，包含未登录用户）
                    .failureUrl("/login/fail")//用户密码错误跳转接口
                    .defaultSuccessUrl("/login/success", true)//登录成功跳转接口（true：是指登录成功后，始终跳转到登录成功url。它默认为false）
                    .loginProcessingUrl("/login")//post登录接口，登录验证由系统实现
                    .usernameParameter("username")//要认证的用户参数名，默认username
                    .passwordParameter("password")//要认证的密码参数名，默认password
                    .and()
                .logout()//配置注销
                    .logoutUrl("/logout")//注销接口
                    .logoutSuccessUrl("/login/logout").permitAll()//注销成功跳转接口（permitAll允许任何人请求，包含未登录用户）
                    .deleteCookies("myCookie")//删除自定义的cookie
                    .and()
                .addFilter(new JwtLoginFilter(super.authenticationManager(),rsaKeyProperties))//登录过滤器
                .addFilter(new JwtVerifyFilter(super.authenticationManager(),rsaKeyProperties))//资源访问过滤器
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);    //禁用session (基于token，所以不需要session)
                /*
                SessionCreationPolicy.ALWAYS//如果当前请求没有session存在，Spring Security创建一个session。
                SessionCreationPolicy.IF_REQUIRED//(默认)Spring Security在需要时才创建session
                SessionCreationPolicy.NEVER// Spring Security将永远不会主动创建session，但是如果session已经存在，它将使用该session
                SessionCreationPolicy.STATELESS//Spring Security不会创建或使用任何session。适合于接口型的无状态应用，该方式节省资源。
                */
    }

}
