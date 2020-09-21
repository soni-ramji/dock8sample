/**
 * 
 */
package com.jmm.capital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ram Ji Soni
 *
 */
@RestController
public class MyController {

	@GetMapping("/hello")
	public String sayHello() {
		return "is working";
	}

}
