package com.suyao.arch_im;

import com.suyao.arch_im.demo.ServerLauncherImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname ArchImApplication
 * @Description TODO
 * @Date 2022/8/4 15:30
 * @Created by B105
 */
@SpringBootApplication
public class ArchImApplication {
    public static void main(String[] args) {
        try{
            // 实例化后记得startup哦，单独startup()的目的是让调用者可以延迟决定何时真正启动IM服务
            final ServerLauncherImpl sli = new ServerLauncherImpl();

            // 启动MobileIMSDK服务端的Demo
            sli.startup();

            // 加一个钩子，确保在JVM退出时释放netty的资源
            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    sli.shutdown();
                }
            });
        }catch (Exception e){

        }

        SpringApplication.run(ArchImApplication.class, args);
    }
}
