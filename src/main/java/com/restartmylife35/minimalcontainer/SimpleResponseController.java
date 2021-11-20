package com.restartmylife35.minimalcontainer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleResponseController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index() throws InterruptedException {
		Thread.sleep(5000);
		return "Hello Container World!";
	}
}
