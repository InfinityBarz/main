package com.crptapi.crptapibackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crptapi/v1")
public class ControllerV1 {
	
//	  private static final Logger logger = LoggerFactory.getLogger(ControllerV1.class);
	
	@GetMapping("helloWorld")
	public String helloWorld() {
		return "hi";
	}

}
