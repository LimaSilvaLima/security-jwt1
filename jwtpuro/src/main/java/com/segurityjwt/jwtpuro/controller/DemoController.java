package com.segurityjwt.jwtpuro.controller;
import com.segurityjwt.jwtpuro.entity.Demo;
import com.segurityjwt.jwtpuro.service.DemoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    
    DemoService demoService;
       
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/{id}")
    public Demo getDemo(@PathVariable("id") Long id) {
        return demoService.getDemo(id).orElse(null);
    }
}
