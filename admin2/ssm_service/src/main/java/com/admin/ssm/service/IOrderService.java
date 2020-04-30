package com.admin.ssm.service;

import com.admin.ssm.domain.Order;

import java.util.List;

public interface IOrderService {
     List<Order> findAll(Integer page, Integer pageSize) throws Exception;

     Order findById(String id) throws Exception;

}
