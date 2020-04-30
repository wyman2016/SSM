package com.admin.ssm.dao;

import com.admin.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ITravellerDao {

//    取结果集
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{orderId})")
    public List<Traveller> findTravellersById(String orderId) throws Exception;
}
