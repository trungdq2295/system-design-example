package com.trungnguyen.locationcaptureservice.controller;

import com.trungnguyen.locationcaptureservice.constant.CommonConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CommonConstant.VERSION_V1 + CommonConstant.TEST_ENDPOINT)
public class TestController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
