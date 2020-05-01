package com.admin.ssm.service.impl;

import com.admin.ssm.dao.UserDao;
import com.admin.ssm.domain.UserInfo;
import com.admin.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;


    @Override

    public List<UserInfo> findAll() throws Exception {
        return userDao.findAll();
    }

    @Override
    public void save(UserInfo user) throws Exception {
         userDao.saveUser(user);
    }

    @Override
    public UserInfo findUserById(String id) throws Exception {
        return userDao.findUserById(id);
    }


}
