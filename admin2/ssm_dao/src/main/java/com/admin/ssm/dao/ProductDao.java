package com.admin.ssm.dao;


import com.admin.ssm.domain.Product;
import com.admin.ssm.domain.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    @Select("select * from product")
    public List<Product> findProduct() throws Exception;


    @Select("select * from product where id=#{id}")
    public List<Product> findProductById(String id) throws Exception;

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
     void saveProduct(Product product) throws Exception;

}
