package com.zzq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zzq.domain.Product;
import com.zzq.domain.Query;
import com.zzq.service.ProductService;
import com.zzq.utils.Page;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping(value="selectproduct")
	public String findProduct(Query vo,Model model){
		List<Product> page = productService.queryProduct();
		model.addAttribute("page",page);
		Page<Product> page1 = productService.selectProduct(vo);
		model.addAttribute("page", page1);
		model.addAttribute("productName", vo.getProductName());
		return "product";
		
	}
	
	@RequestMapping(value="deleteProduct.action")
	public String delete(Integer id){
		productService.deleteProductById(id);
		return "ok";
	}
}
