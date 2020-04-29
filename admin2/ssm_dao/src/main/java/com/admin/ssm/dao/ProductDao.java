package com.admin.ssm.dao;


import com.admin.ssm.domain.Product;
import com.admin.ssm.domain.UserInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    @Select("select *from product")
    public List<Product> findProduct() throws Exception;

}
