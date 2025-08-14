package com.alt.serviceImpl;

import com.alt.bean.ProductBean;
import com.alt.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductBean registerProduct(ProductBean product) {
        return null;
    }

    @Override
    public ProductBean updateProduct(ProductBean product) {
        return null;
    }

    @Override
    public ProductBean fetchProductById(int id) {
        return null;
    }

    @Override
    public List<ProductBean> fetchAllProductBy() {
        return List.of();
    }

    @Override
    public void deleteProduct() {

    }
}
