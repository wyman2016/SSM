package com.admin.ssm.dao;

import com.admin.ssm.domain.Member;
import com.admin.ssm.domain.Order;
import com.admin.ssm.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrderDao {
    @Select("select  * from orders")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productId", javaType = Product.class, one = @One(select = "com.admin.ssm.dao.ProductDao.findProductById")),
    })
    List<Order> findAll();


    @Select("select *from orders where id=#{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productId", javaType = Product.class, one = @One(select = "com.admin.ssm.dao.ProductDao.findProductById")),
            @Result(property = "travellers", column = "id", javaType = java.util.List.class, many = @Many(select = "com.admin.ssm.dao.ITravellerDao.findTravellersById")),
            @Result(property = "member", column = "memberid", javaType = Member.class, one = @One(select = "com.admin.ssm.dao.MemberDao.findMemberById")),
    })
    Order findById(String id) throws Exception;


}
