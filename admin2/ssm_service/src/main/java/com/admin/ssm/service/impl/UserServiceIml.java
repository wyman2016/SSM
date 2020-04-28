package com.admin.ssm.service.impl;

import com.admin.ssm.dao.UserDao;
import com.admin.ssm.domain.Role;
import com.admin.ssm.domain.UserInfo;
import com.admin.ssm.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceIml implements IUsersService {

    @Autowired
    private UserDao userDao;


    @Override
    public UserDetails loadUserByUsername(String var1) throws UsernameNotFoundException {
        System.out.println("开始登陆了");

        UserInfo userInfo = null;
        try {
            System.out.println("开始查询");

            userInfo = userDao.findUserByUsername(var1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        list.add(new SimpleGrantedAuthority("ROLE_" + "ADMIN"));

        User user = new User(userInfo.getUsername(), userInfo.getPassword(), userInfo.getStatus() == 0 ? false : true
                , true, true, true, list);

        List<Role> roles =  userInfo.getRoles();
        System.out.println("Role");


        List<SimpleGrantedAuthority> list1 = getAuthority(userInfo.getRoles());
        System.out.println("author");
        System.out.println(user);

        return user;
    }

    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {

        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        list.add(new SimpleGrantedAuthority("ROLE_" + "ADMIN"));

        return list;
    }
}
