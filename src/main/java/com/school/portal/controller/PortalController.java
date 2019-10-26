package com.school.portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalController {

	@RequestMapping("/")
	public String home() {
		return "Asto ma sadgamya,tamso ma jyotigamya,mrtyor ma amritamgamya. Om shanti shanti shanti.";
	}
}
