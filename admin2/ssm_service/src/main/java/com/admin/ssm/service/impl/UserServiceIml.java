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
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceIml implements IUsersService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String var1) throws UsernameNotFoundException {

        UserInfo userInfo = null;
        try {
            userInfo = userDao.findUserByUsername(var1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        User user = new User(userInfo.getUsername(), userInfo.getPassword(), userInfo.getStatus() == 0 ? false : true
                , true, true, true, getAuthority(userInfo.getRoles()));
        return user;
    }

    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        try {
            for (int i = 0; i < roles.size(); i++) {
                list.add(new SimpleGrantedAuthority("ROLE_" + roles.get(i).getRoleName()));
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return list;
    }
}
