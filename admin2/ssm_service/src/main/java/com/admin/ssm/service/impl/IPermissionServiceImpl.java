package com.admin.ssm.service.impl;

import com.admin.ssm.dao.IPermissonDao;
import com.admin.ssm.domain.Permission;
import com.admin.ssm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissonDao iPermissonDao;
    @Override
    public List<Permission> findAll() throws Exception {
        return iPermissonDao.findAll();
    }
}
