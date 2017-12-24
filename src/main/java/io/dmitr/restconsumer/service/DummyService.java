package io.dmitr.restconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class DummyService {

    private final RestTemplate restTemplate;

    public DummyService(RestTemplate rest) {
        this.restTemplate = rest;
    }

    @HystrixCommand(fallbackMethod = "defaultEcho")
    public String callEcho(String echo) {
        URI uri = URI.create(String.format("http://localhost:9090/echo/%s",echo));

        return this.restTemplate.getForObject(uri, String.class);
    }

    public String defaultEcho(String echo) {
        return "Default Echo!";
    }
}
