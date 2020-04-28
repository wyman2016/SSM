package com.admin.ssm.dao;

import com.admin.ssm.domain.UserInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    @Select("select *from users where username=#{username}")
    public UserInfo findUserByUsername(String username) throws Exception;


}
