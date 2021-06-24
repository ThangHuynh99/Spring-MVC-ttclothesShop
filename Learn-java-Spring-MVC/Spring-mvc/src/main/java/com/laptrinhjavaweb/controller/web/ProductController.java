package com.laptrinhjavaweb.controller.web;

import org.springframework.data.domain.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.service.IProductService;

@Controller(value = "productControllerOfWeb")
public class ProductController {
	@Autowired
	private IProductService iProductService;

	@RequestMapping(value = "/collection/{name}", method = RequestMethod.GET)
	public ModelAndView showProductPage(@PathVariable(value = "name", required = false) String name,
			@RequestParam(value = "page", required = false, defaultValue = "1") int page,
			@RequestParam(value = "q", required = false, defaultValue = "") String q,
			@RequestParam(value = "s", required = false, defaultValue = "0") double s) {
		double startPrice = 0, endPrice = s;
		ModelAndView mav = new ModelAndView("web/product");
		ProductDTO productDTO = new ProductDTO();
		Pageable pageable = new PageRequest(page - 1, 6);
		productDTO.setPage(page);
		productDTO.setTotalPage((int) Math.ceil((double) iProductService.countTotalItem(name) / 6));
		if (!q.equals("")) {
			productDTO.setListResult(iProductService.findByCatalogIdAndProductNameContaining(name, q, pageable));
		} else if (q.equals("") && s == 0) {
			productDTO.setListResult(iProductService.findByCatalogId(name, pageable));
		} else if (s > 0) {
			if (s == 500000) {
				startPrice = 100000;
			} else if( s == 1000000) {
				startPrice = 500100;
			} else {
				startPrice = endPrice - 999999;
			}
			productDTO.setListResult(iProductService.findBycatalogIdAndPriceBetween(name, startPrice, endPrice, pageable));
		}
		mav.addObject("products", productDTO);
		mav.addObject("catalogcode", name);
		return mav;
	}

	@RequestMapping(value = "/product/{code}", method = RequestMethod.GET)
	public ModelAndView ShowProductDetailPage(@PathVariable(value = "code", required = false) String code) {
		ModelAndView mav = new ModelAndView("web/detail-product");
		mav.addObject("productDetail", iProductService.findByProductCode(code));
		return mav;
	}

}
