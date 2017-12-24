package io.dmitr.restconsumer;

import io.dmitr.restconsumer.service.DummyClient;
import org.springframework.stereotype.Component;


@Component
public class DummyClientFallback implements DummyClient {

    @Override
    public String getEcho(String echo) {
        return "Something went wrong";
    }
}
