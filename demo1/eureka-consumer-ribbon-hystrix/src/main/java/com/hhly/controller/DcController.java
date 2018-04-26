package com.hhly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hhly.service.ConsumerService;

/**
 * TODO
 *
 * @author xuph-1028
 * @date 2018/3/15 16:16
 */
@RestController
public class DcController {
    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }

}
