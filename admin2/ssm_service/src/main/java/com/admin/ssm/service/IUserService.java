package com.admin.ssm.service;

import com.admin.ssm.domain.Product;
import com.admin.ssm.domain.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {

    List<UserInfo> findAll() throws Exception;

    public void save(UserInfo product) throws Exception;

    UserInfo findUserById(String id) throws Exception;
}
