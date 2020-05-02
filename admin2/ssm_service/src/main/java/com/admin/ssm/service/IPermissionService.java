package com.admin.ssm.service;

import com.admin.ssm.domain.Permission;

import java.util.List;

public interface IPermissionService {
    List<Permission> findAll() throws Exception;
}
