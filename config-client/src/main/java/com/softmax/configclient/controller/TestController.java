package com.softmax.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jarvis
 * @date 2018/8/23
 */
@RestController
public class TestController {

    @Value("${name}")
    String name;

    @Value("${version}")
    String version;

    @RequestMapping("/config")
    public String getConfig() {
        return "Config: " + name + " -- " + version;
    }
}
