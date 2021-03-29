package com.laptrinhjavaweb.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService iProductService;
	
	
	 @RequestMapping(value = "/product", method = RequestMethod.GET)
	    public ModelAndView showProductPage(@RequestParam(value = "id", required = false) Long id) { 
	        ModelAndView mav = new ModelAndView("web/product");   
	        mav.addObject("products", iProductService.findByCatalogId(id));
	        return mav;
	    }
	 
	 @RequestMapping(value = "/product/detail", method = RequestMethod.GET)
	    public ModelAndView productDetailPage() { 	  	
	        ModelAndView mav = new ModelAndView("web/detail-product");   
	        return mav;
	    }
}
