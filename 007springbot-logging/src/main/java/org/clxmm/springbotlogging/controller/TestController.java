package org.clxmm.springbotlogging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author clx
 * @date 2020/8/13 9:19
 */
@RestController
@RequestMapping("test")
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);


    @GetMapping("/")
    public String Hello() {
        logger.info("test logging  ");

        return "hello";
    }

}
