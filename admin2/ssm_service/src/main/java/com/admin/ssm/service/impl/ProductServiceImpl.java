package com.admin.ssm.service.impl;

import com.admin.ssm.dao.ProductDao;
import com.admin.ssm.dao.UserDao;
import com.admin.ssm.domain.Product;
import com.admin.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception{
        return productDao.findProduct();
    }

    @Override
    public void save(Product product) throws Exception {
        productDao.saveProduct(product);
    }
}
