package com.admin.ssm.service;

import com.admin.ssm.domain.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll() throws Exception;
}
