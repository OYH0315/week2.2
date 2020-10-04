package service.impl;

import dao.impl.userdaoimpl;
import dao.userdao;
import pojo.user;
import service.userservice;

import java.util.List;

public class userserviceimpl implements userservice {
    private userdao dao=new userdaoimpl();
    @Override
    public void registuser(user user) {
       dao.saveuser(user);
    }

    @Override
    public user loginuser(user user) {
       return dao.queryuserbyusername(user.getUsername());
    }

    @Override
    public boolean checkuser(String username) {
        if(dao.queryuserbyusername(username)==null)
        {
            return false;
        }
        else return true;
    }

    @Override
    public user exituser(String username) {
        if(dao.queryuserbyusername(username)==null)
        {
            return  null;
        }
        else {
            return dao.queryuserbyusername(username);
        }
    }

    @Override
    public List<user> query() {
        return dao.queryfoelist();
    }
}
