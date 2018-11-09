package org.surya.test.spring.actuator;


import java.util.concurrent.atomic.AtomicLong;

import org.surya.test.spring.actuator.hello.Greeting;
import org.surya.test.spring.actuator.hello.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    GreetingService service;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

        service.saySomething("number :"+counter.incrementAndGet());
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}