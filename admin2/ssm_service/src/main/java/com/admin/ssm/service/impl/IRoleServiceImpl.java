package com.admin.ssm.service.impl;

import com.admin.ssm.dao.IRoleDao;
import com.admin.ssm.domain.Role;
import com.admin.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao iRoleDao;
    @Override
    public List<Role> findAll() throws Exception {
        return iRoleDao.findAllRole();
    }
}
