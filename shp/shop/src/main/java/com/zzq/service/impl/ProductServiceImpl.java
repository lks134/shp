package com.zzq.service.impl;



import java.util.HashMap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.zzq.dao.ProductDao;

import com.zzq.domain.Product;
import com.zzq.domain.Query;
import com.zzq.domain.Shopcar;
import com.zzq.service.ProductService;
import com.zzq.utils.Page;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productdao;

	public Page<Product> selectProduct(Query vo) {
		Page<Product> page=new Page<Product>();
		//每页数
		page.setSize(5);
		vo.setSize(5);
		if (null != vo) {
		// 判断当前页
		if (null != vo.getPage()) {
			page.setPage(vo.getPage());
			vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
		if(null != vo.getProductName() && !"".equals(vo.getProductName().trim())){
			vo.setProductName(vo.getProductName().trim());
			}
		
		page.setTotal(productdao.productCountByQueryVo(vo));
		page.setRows(productdao.selectProductListByQueryVo(vo));
		}
		
		return page;
	}



	public Product updateProductById(Integer id) {
		Product prd = productdao.selectProductById(id);
		
		HashMap<Integer, Integer> productlist = prd.getProductlist();
		if(productlist.get(id)>0){
			productlist.put(id, productlist.get(id)-1);
		}else{
			productlist.remove(id);
		}
		prd.setProductlist(productlist);
		prd.setProduct_count(prd.getProduct_count()-1);
		prd.setProduct_price(prd.getProduct_price());
		
		return prd;
	}

	public void deleteProductById(Integer id) {
		productdao.deleteProductById(id);
	}

	public List<Product> queryProduct() {
		// TODO Auto-generated method stub
		return productdao.queryProduct();
	}



	public Product selectProductByid(Integer id) {
		// TODO Auto-generated method stub
		return productdao.selectProductById(id);
	}



	public void addShopcar(Product product) {
		
		Product product2 = productdao.selectProductById(product.getProduct_id());
		if(product2!=null){
			productdao.addShopcar(product);
		}else{
			try {
				throw new Exception("无此商品");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public List<Shopcar> findShopcar() {
		return productdao.showShopcar();
	}
	

}
