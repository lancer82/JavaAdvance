package java.com.hbliti.example4.generic.dao;

import java.com.hbliti.example4.generic.bean.User;
import java.util.List;

public interface UserDao extends BaseDao<User> {

    //按照行查询,额外的业务逻辑.
    List<User>findAll();
}


