package com.admin.ssm.controller;


import com.admin.ssm.domain.Role;
import com.admin.ssm.domain.UserInfo;
import com.admin.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;

    @RequestMapping("/findAll.do")
    private ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Role> ps = iRoleService.findAll();
        mv.addObject("roleList", ps);
        mv.setViewName("role-list");
        return mv;
    }

}
