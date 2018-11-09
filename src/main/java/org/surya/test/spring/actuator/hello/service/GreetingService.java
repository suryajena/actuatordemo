package org.surya.test.spring.actuator.hello.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    String something=null;
    final static Logger logger = LoggerFactory.getLogger(GreetingService.class);
    public String saySomething(String somethingnew){

        logger.debug("Debugging , changing word to {}. Old temperature was {}.", something, somethingnew);
        logger.info("Info , changing word to {}. Old temperature was {}.", something, somethingnew);
        logger.warn("Warn , changing word to {}. Old temperature was {}.", something, somethingnew);

        something=somethingnew;
        return "I am saying, " + something;
    }
}
