package com.zzq.dao;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.zzq.domain.Product;
import com.zzq.domain.Query;
import com.zzq.domain.Shopcar;



public interface ProductDao {
	//总条数
	public Integer productCountByQueryVo(Query vo);
	//结果集
	public List<Product> selectProductListByQueryVo(Query vo);
	public Product selectProductById(Integer id);
	//修改客户通过ID
	public void updateProductById(Product product);
	//通过ID 删除客户
	public void deleteProductById(Integer id);
	public List<Product> queryProduct();
	public int addShopcar(Product product);
	public List<Shopcar> showShopcar();

}
