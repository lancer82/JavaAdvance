package com.hbliti.example4.generic.dao;

import java.util.List;

import com.hbliti.example4.generic.bean.User;

public interface UserDao extends BaseDao<User> {

    //按照行查询,额外的业务逻辑.
    List<User>findAll();
}


