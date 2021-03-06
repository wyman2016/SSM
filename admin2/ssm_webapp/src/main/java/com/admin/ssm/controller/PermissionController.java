package com.admin.ssm.controller;

import com.admin.ssm.domain.Permission;
import com.admin.ssm.service.IPermissionService;
import com.admin.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private IPermissionService iPermissionService;

    @RequestMapping("/findAll.do")
    private ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Permission> ps = iPermissionService.findAll();
        mv.addObject("permissionList", ps);
        mv.setViewName("permission-list");
        return mv;
    }
}
