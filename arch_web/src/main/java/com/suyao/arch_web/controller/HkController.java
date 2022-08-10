package com.suyao.arch_web.controller;

import com.alibaba.fastjson.JSONObject;

import com.suyao.arch_web.vo.InitVedio;
import com.suyao.arch_web.vo.InitVedioIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 在springboot中
 * @RestController注解相当于@ResponseBody ＋ @Controller;
 * 使用@RestController 注解，则Controller中的方法无法返回jsp页面，或者html
 * 使用@Controller 注解，在对应的方法上，视图解析器可以解析return 的jsp,html页面，并且跳转到相应页面
 * 若返回json等内容到页面，则方法名需要加@ResponseBody注解
 *
 * @Classname HkController
 * @Description TODO
 * @Date 2022/7/25 16:56
 * @Created by B105
 */
//@RestController
@Controller
public class HkController {

    @Autowired(required = false)
    protected HttpServletRequest request;

    @GetMapping("/toPage")
    public ModelAndView toPage(){

        return new ModelAndView("/hk/demo_window_simple_preview.html");
    }

    @GetMapping("/toPage2")
    public ModelAndView toPage2(){

        return new ModelAndView("/hk/demo_window_integration.html");
    }

    @RequestMapping("/showVedio")
    @ResponseBody
    public String showVedio(String code)throws Exception{
        Map result = new HashMap();
        InitVedioIndex vedioIndex = new InitVedioIndex(code);
        Map map = new HashMap();
        map.put("argument", vedioIndex);
        map.put("funcName", "startPreview");
        result.put("code", "1");
        result.put("msg", "success");
        result.put("data", JSONObject.toJSONString(map));
        return JSONObject.toJSONString(result);
    }

    @GetMapping("/initPlugin")
    public ModelAndView initPlugin(Model model)throws Exception{
        InitVedio init= new InitVedio("26568031","124.72.50.186",86,"YN3GkzwZkNdzu9igHrk1",1,"2x2",0);
        Map map = new HashMap();
        map.put("argument", JSONObject.toJSONString(init));
        map.put("funcName", "init");
        ModelAndView view = new ModelAndView("vedio/vedioPlugin.html");
        view.addObject("vedioParam", JSONObject.toJSONString(map));
        return view;
    }


    @GetMapping("/provinceVedio")
    public String provinceVedio(Model model)throws Exception{
        //model.addAttribute("name", "Tom");
        //model.addAttribute("ctx", request.getContextPath());
        return "vedio/provinceVedio";
    }
}
