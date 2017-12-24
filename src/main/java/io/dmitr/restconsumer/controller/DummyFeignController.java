package io.dmitr.restconsumer.controller;

import io.dmitr.restconsumer.service.DummyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyFeignController {

    @Autowired
    private DummyClient dymmyClient;

    @GetMapping("/get-echo/{echo}")
    public String getEcho(@PathVariable("echo") String echo) {
        return dymmyClient.getEcho(echo);
    }
}
