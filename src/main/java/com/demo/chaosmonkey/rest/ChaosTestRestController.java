package com.demo.chaosmonkey.rest;

import com.demo.chaosmonkey.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TAYYAB
 */

@RestController
public class ChaosTestRestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String chaosGetTesting() {
        String s = testService.testService();
        return "GOT RESPONSE!!" + s;
    }
}
