package com.laptrinhjavaweb.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	 @RequestMapping(value = "/product", method = RequestMethod.GET)
	    public ModelAndView productPage() { 	  	
	        ModelAndView mav = new ModelAndView("web/product");   
	        return mav;
	    }
	 
	 @RequestMapping(value = "/product/detail", method = RequestMethod.GET)
	    public ModelAndView productDetailPage() { 	  	
	        ModelAndView mav = new ModelAndView("web/detail-product");   
	        return mav;
	    }
}
