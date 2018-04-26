
package com.hhly.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 * @author xuph-1028
 * @date 2018/3/19 16:00
 */
@RestController
public class HelloController {

	@Value("${env.name}")
	private String envName;

	@RequestMapping(value = "/t")
	public String tt() {
		return "----envName-----" + envName;
	}
}
