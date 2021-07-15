package com.example.mavendemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhaoqiang
 * @title: WebController
 * @projectName mavendemo
 * @description: TODO
 * @date 2021/7/15 16:47
 */
@RestController
public class WebController {

    @RequestMapping("/kevin")
    public String index() {
        return "Hello kevin!" + "55555";
    }

}
