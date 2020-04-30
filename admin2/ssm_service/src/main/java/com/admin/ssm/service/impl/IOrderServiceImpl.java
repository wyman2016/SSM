package com.admin.ssm.service.impl;

import com.admin.ssm.dao.OrderDao;
import com.admin.ssm.domain.Order;
import com.admin.ssm.service.IOrderService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IOrderServiceImpl implements IOrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> findAll(Integer page, Integer pageSize) throws Exception {
        PageHelper.startPage(page, pageSize);
        return orderDao.findAll();
    }
//    @Override

     public Order findById(String id) throws Exception {
         return orderDao.findById(id);
    }

}
