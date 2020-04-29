package com.admin.ssm.controller;


import com.admin.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@RequestMapping("/product")
public class ProductController {


    @Autowired
    private IProductService iProductService;

    @RequestMapping("/findAll")

    public ModelAndView findAllProduct() throws Exception {

        HashMap hashMap = new HashMap();
        hashMap.put("productList", iProductService.findAll());
        ModelAndView modelAndView = new ModelAndView("product-list1", hashMap);
        return modelAndView;
    }
}
