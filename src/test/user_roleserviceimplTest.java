package test;

import org.junit.Test;
import service.impl.user_roleserviceimpl;
import service.user_roleservice;

import static org.junit.Assert.*;

public class user_roleserviceimplTest {
    @Test
    public void test1()
    {
        user_roleservice user_roleservice=new user_roleserviceimpl();
        System.out.println(user_roleservice.getroleid(1));
    }

}