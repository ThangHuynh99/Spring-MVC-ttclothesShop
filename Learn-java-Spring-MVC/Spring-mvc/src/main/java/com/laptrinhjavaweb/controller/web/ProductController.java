package com.laptrinhjavaweb.controller.web;

import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService iProductService;

	@RequestMapping(value = "/collection/{name}", method = RequestMethod.GET)
	public ModelAndView showProductPage(@PathVariable(value = "name", required = false) String name) {
		ModelAndView mav = new ModelAndView("web/product");
		mav.addObject("products", iProductService.findByCatalogId(name));
		return mav;
	}

	@RequestMapping(value = "/product/{code}", method = RequestMethod.GET)
	public ModelAndView ShowProductDetailPage(@PathVariable(value = "code", required = false) String code) {
		ModelAndView mav = new ModelAndView("web/detail-product");
		mav.addObject("productDetail", iProductService.findByProductCode(code));
		return mav;
	}
}
