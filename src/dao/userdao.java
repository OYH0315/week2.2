package dao;

import pojo.user;

import java.util.List;

public interface userdao {
    public user queryuserbyusername(String username);
    public int saveuser(user user);
    public user querybyusernameandpassword(String username,String password);
    public List<user> queryfoelist();
}
