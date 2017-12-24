package io.dmitr.restconsumer.service;

import io.dmitr.restconsumer.DummyClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "rest-producer", url = "http://localhost:9090", fallback = DummyClientFallback.class)
public interface DummyClient {
    @GetMapping(value = "/echo/{echo}")
    public String getEcho(@PathVariable("echo") String echo);
}
