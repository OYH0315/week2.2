package service.impl;

import dao.impl.user_roledaoimpl;
import dao.user_roledao;
import service.user_roleservice;

public class user_roleserviceimpl implements user_roleservice {
    @Override
    public int getroleid(int userid) {
        user_roledao dao=new user_roledaoimpl();
        return  dao.getroleid(userid);
    }
}
