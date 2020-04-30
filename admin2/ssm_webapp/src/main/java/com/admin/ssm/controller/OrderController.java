package com.admin.ssm.controller;

import com.admin.ssm.domain.Order;
import com.admin.ssm.domain.Product;
import com.admin.ssm.service.IOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private IOrderService iOrderService;

    @RequestMapping("/findAll.do")

    public ModelAndView findAllOrders(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page
            , @RequestParam(name = "size", required = true, defaultValue = "10") Integer size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Order> ps = iOrderService.findAll(page, size);
        PageInfo pageInfo = new PageInfo(ps);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("orders-page-list");
        return mv;
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id", required = true) String id) throws Exception {
        ModelAndView mv = new ModelAndView();
        Order order = iOrderService.findById(id);
        mv.addObject("orders", order);
        mv.setViewName("orders-show");
        return mv;
    }

}
