package com.admin.ssm.controller;


import com.admin.ssm.domain.Product;
import com.admin.ssm.domain.UserInfo;
import com.admin.ssm.service.IProductService;
import com.admin.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/findAll.do")
    private ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<UserInfo> ps = iUserService.findAll();
        mv.addObject("userList", ps);
        mv.setViewName("user-list");
        return mv;
    }

    @RequestMapping("/findById.do")
    private ModelAndView findById(String id) throws Exception {
        ModelAndView mv = new ModelAndView();
        UserInfo ps = iUserService.findUserById(id);
        mv.addObject("user", ps);
        mv.setViewName("user-show1");
        return mv;
    }


    @RequestMapping("/save.do")
    private String saveUser(UserInfo info) throws Exception {
        BCryptPasswordEncoder bcEncode = new BCryptPasswordEncoder();
        info.setPassword(bcEncode.encode(info.getPassword()));
        iUserService.save(info);
        return "redirect:findAll.do";
    }

    findUserByIdAndAllRole.do?id=${user.id}

}
