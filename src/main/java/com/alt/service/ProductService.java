package com.alt.service;

import com.alt.bean.ProductBean;

import java.util.List;

public interface ProductService {

    public ProductBean registerProduct(ProductBean product);

    public ProductBean updateProduct(ProductBean product);
    public ProductBean fetchProductById(int id);
    public List<ProductBean> fetchAllProductBy();
    public void deleteProduct();
}
