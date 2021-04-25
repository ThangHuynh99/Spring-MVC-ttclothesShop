package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.service.ICatalogService;

@Controller
public class CategoryController {
	@Autowired
	private ICatalogService iCatalogService;

	@RequestMapping(value = "/admin/category", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/sanpham/danhmuc");
		mav.addObject("catalog", iCatalogService.findAll());
		return mav;
	}

}
