package com.demo.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-eureka-client")
public interface DemoClient {
	@GetMapping("/dc")
    String consumer();
}
