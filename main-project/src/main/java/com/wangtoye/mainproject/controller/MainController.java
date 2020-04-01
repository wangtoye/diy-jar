package com.wangtoye.mainproject.controller;


import com.wangtoye.hellojar.service.HelloService;
import com.wangtoye.worldjarspringbootstarter.service.FullService;
import com.wangtoye.worldjarspringbootstarter.service.WorldService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangye
 * @date 2020/3/31
 * @description
 */
@RestController
public class MainController {

    @Resource
    private HelloService helloService;

    @Resource
    private FullService fullService;

    @Resource
    private WorldService worldService;

    @RequestMapping("/t1")
    public String t1() {
        return helloService.hello();
    }

    @RequestMapping("/t2")
    public String t2() {
        return new HelloService().hello();
    }

    @RequestMapping("/t3")
    public String t3() {
        return fullService.print();
    }

    @RequestMapping("/t4")
    public String t4() {
        return worldService.print();
    }
}
