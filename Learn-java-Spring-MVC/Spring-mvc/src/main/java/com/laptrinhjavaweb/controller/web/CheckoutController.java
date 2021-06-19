package com.laptrinhjavaweb.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CheckoutController {
	
	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public ModelAndView showCheckout() {
		ModelAndView mav = new ModelAndView("web/checkout");
		return mav;
	}
}
