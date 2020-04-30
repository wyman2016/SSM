package com.admin.ssm.controller;


import com.admin.ssm.domain.Product;
import com.admin.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private IProductService iProductService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAllProduct() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> ps = iProductService.findAll();
        mv.addObject("productList", ps);
        mv.setViewName("product-list1");
        return mv;
    }

    @RequestMapping("/save.do")
    public String saveProduct(Product product) throws Exception {
        iProductService.save(product);
        return "redirect:findAll.do";
    }


}
