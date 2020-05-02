package com.admin.ssm.dao;

import com.admin.ssm.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IRoleDao {

    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    public List<Role> findRolesByUserId(String userId) throws Exception;


    @Select("select * from role")
    List<Role> findAllRole() throws Exception;
}
