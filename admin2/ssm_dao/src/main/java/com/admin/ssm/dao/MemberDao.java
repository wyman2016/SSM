package com.admin.ssm.dao;

import com.admin.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

public interface MemberDao {

    @Select("select *from member where id=#{id}")
    Member findMemberById(String id) throws Exception;
}
