package com.zzq.service;

import java.util.List;


import org.apache.ibatis.annotations.Param;


import com.zzq.domain.Product;
import com.zzq.domain.Query;
import com.zzq.domain.Shopcar;
import com.zzq.utils.Page;

public interface ProductService {
		
    //通过name查询分页
	public Page<Product> selectProduct(Query vo);
	public Product selectProductByid(Integer id);
	//修改商品数量
	public Product updateProductById(Integer id);
	//通过ID 删除客户
	public void deleteProductById(Integer id);
	public List<Product> queryProduct();
	//加入购物车
	public void addShopcar(Product product);
	//查看购物车
	public List<Shopcar> findShopcar();
	//商品减少
	//public String subSopcar(String id);
	
}
