package io.dmitr.restconsumer.controller;

import io.dmitr.restconsumer.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DummyController {

    @Autowired
    private DummyService dummyService;

    @GetMapping("/get-echo-rest-template/{echo}")
    public String getEcho(@PathVariable("echo") String echo) {

        return dummyService.callEcho(echo);

    }
}
