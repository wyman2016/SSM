package com.admin.ssm.service;

import com.admin.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll() throws Exception;

}
