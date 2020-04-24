package com.admin.ssm.service.impl;

import com.admin.ssm.service.IUsersService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceIml implements IUsersService {

    @Override
    public UserDetails loadUserByUsername(String var1) throws UsernameNotFoundException {
        return null;
    }

}
