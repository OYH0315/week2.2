package dao.impl;

import dao.userdao;
import pojo.user;

import java.util.List;

public class userdaoimpl extends  basedao implements userdao{

    @Override
    public user queryuserbyusername(String username) {
        String sql="select * from t_user where username=?";
        return queryforone(user.class,sql,username);
    }

    @Override
    public int saveuser(user user) {
        String sql="insert into t_user(username,password,email) values(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public user querybyusernameandpassword(String username, String password) {
        String sql="select * from t_user where username=? and password=?";
        return queryforone(user.class,sql,username,password);
    }

    @Override
    public List<user> queryfoelist() {
        String sql="select * from t_user";
        return queryfolist(user.class,sql);
    }
}