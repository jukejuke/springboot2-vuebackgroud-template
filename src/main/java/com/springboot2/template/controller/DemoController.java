package com.springboot2.template.controller;

import com.springboot2.template.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

/**
 * @author Yaosh
 * @version 1.0
 * @commpany 星瑞国际
 * @date 2019/8/15 11:26
 * @return
 */
@RequestMapping("/demo")
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping(value="/jsonDemo")
    @ResponseBody
    public String jsonDemo(){
        return "test";
    }

    @GetMapping(value = "jsonDemo2")
    @ResponseBody
    public Map<String,Object> jsonDemo2(){
        return demoService.query();
    }

}
