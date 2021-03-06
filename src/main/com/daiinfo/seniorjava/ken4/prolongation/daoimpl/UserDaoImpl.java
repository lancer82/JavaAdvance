package com.daiinfo.seniorjava.ken4.prolongation.daoimpl;

import java.lang.reflect.ParameterizedType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.daiinfo.seniorjava.ken4.prolongation.bean.User;
import com.daiinfo.seniorjava.ken4.prolongation.dao.UserDao;
import com.daiinfo.seniorjava.ken4.prolongation.helper.JdbcConn;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    private Class<?> EntityClass;

    private String sql;

    private PreparedStatement statement;

    private ResultSet rs;

    private List<User> list;

    public UserDaoImpl() {

        ParameterizedType type = (ParameterizedType) getClass()
                .getGenericSuperclass();
        EntityClass = (Class<?>) type.getActualTypeArguments()[0];
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        StringBuffer b = new StringBuffer();
        list = new ArrayList<User>();
        sql = b.append("select * from " + EntityClass.getSimpleName())
                .toString();
        try {
            statement = JdbcConn.getPreparedStatement(sql);
            rs = statement.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("username"));
                user.setGrade(rs.getInt("grade"));
                list.add(user);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }

}
