package com.daiinfo.seniorjava.ken4.prolongation.dao;

import java.util.List;

import com.daiinfo.seniorjava.ken4.prolongation.bean.User;

public interface UserDao extends BaseDao<User> {

    //按照行查询,额外的业务逻辑.
    List<User>findAll();
}


