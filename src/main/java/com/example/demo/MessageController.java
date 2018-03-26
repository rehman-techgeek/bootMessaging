package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@Autowired
	Sender sender;
	
	@GetMapping("/send")
	public String handleMeassge(@RequestParam String msg) {
		sender.send(msg);
		return "msg sent";
	}

}
