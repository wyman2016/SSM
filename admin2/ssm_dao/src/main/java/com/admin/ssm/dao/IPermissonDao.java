package com.admin.ssm.dao;

import com.admin.ssm.domain.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPermissonDao {

    @Select("select *from permission")
    List<Permission> findAll() throws Exception;
}
