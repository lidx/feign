package com.demo.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.cloud.service.DemoClient;

@RestController
public class DemoController {
	
	@Autowired
	DemoClient demoClient;
	@GetMapping("/consumer")
    public String dc() {
        return demoClient.consumer();
    }
	

}
