package com.starter;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: zjbing
 **/
@Slf4j
@AllArgsConstructor
public class StarterHandler {

    private String name;

    public void handler() {
        log.info("name:{}",name);
    }
}
