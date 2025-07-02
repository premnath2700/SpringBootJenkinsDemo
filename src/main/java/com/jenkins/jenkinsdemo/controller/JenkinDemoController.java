package com.jenkins.jenkinsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jenkinsdemo")
public class JenkinDemoController {
	
	@RequestMapping(value = "/greetings")
	ResponseEntity<String> greetingsFromJenkins(){
		return new ResponseEntity<String>("Hello from Jenkins!", HttpStatus.OK);
	}
	
}
