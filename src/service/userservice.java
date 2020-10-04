package service;

import pojo.user;

import java.util.List;

public interface userservice {
    public void registuser(user user);
    public user loginuser(user user);
    public boolean checkuser(String username);
    public user exituser(String username);
    public List<user> query();
}
