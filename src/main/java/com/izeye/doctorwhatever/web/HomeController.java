package com.izeye.doctorwhatever.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * {@link Controller} for home.
 *
 * @author Johnny Lim
 */
@Controller
@RequestMapping(path = "/")
public class HomeController {

	@GetMapping
	public String index() {
		return "index";
	}

}
