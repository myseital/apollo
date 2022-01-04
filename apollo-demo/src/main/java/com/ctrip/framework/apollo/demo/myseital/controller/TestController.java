package com.ctrip.framework.apollo.demo.myseital.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author myseital
 * @date 2021/5/26 16:51
 */
@Slf4j
@RestController
public class TestController {

    @Value("${task.retry.max.num}")
    private Integer num;

    @GetMapping("/apollo")
    public String apollo() {
        Config config = ConfigService.getAppConfig();
        String someKey = "task.retry.max.num";
        String value = config.getProperty(someKey, null);
        log.info("task.retry.max.num: {}", value);
        log.info("num: {}", num);

        return value;
    }
}
