package com.ashokit.springmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main Application controller.
 *
 * @author Ashok
 */
@Controller
@SpringBootApplication
public class DemoApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
}
