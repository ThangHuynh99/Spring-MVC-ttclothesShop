package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.CatalogDTO;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.service.ICatalogService;
import com.laptrinhjavaweb.service.IProductService;

@Controller(value = "productControllerOfAdmin")
public class ProductController {
	@Autowired
	private IProductService iProductService;
	@Autowired
	private ICatalogService iCatalogService;
	
	@RequestMapping("/admin/product/{code}")
	public ModelAndView showProduct(@PathVariable(value = "code") String code, @RequestParam(value= "page", required = false, defaultValue = "1") int page) {
		ProductDTO product = new ProductDTO();
		Pageable pageAble = new PageRequest(page-1, 6);
		product.setPage(page);
		product.setTotalPage((int) Math.ceil((double) iProductService.countTotalItem(code) / 6));
		product.setListResult(iProductService.findByCatalogId(code, pageAble));
		ModelAndView mav = new ModelAndView("/admin/sanpham/chitietSP");
		mav.addObject("product", product);
		mav.addObject("productCode", code);
		return mav;
	}
	
	@RequestMapping("/admin/product/edit")
	public ModelAndView editProduct(@RequestParam(value = "id", required = false)Long id) {
		CatalogDTO catalogDTO = new CatalogDTO();
		ProductDTO product = new ProductDTO();
		ModelAndView mav = new ModelAndView("/admin/sanpham/editSP");
		catalogDTO.setListResult(iCatalogService.findAll());
		if(id != null) {
			 product = iProductService.findOne(id);
		}
		mav.addObject("product", product);
		mav.addObject("catalog", catalogDTO.getListResult());
		return mav;
	}
}
