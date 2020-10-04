package web;

import pojo.downloadlist;
import pojo.user;
import service.downloadlistServicce;
import service.impl.downloadlistServiceimpl;
import service.impl.userserviceimpl;
import service.userservice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class managerServlet extends BaseServlet {
    protected void showdownpage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        downloadlistServicce downloadlistServicce=new downloadlistServiceimpl();
        List<downloadlist> list=downloadlistServicce.querylist();
        request.setAttribute("list",list);
        request.getRequestDispatcher("/pages/manager/down_manager.jsp").forward(request,response);
    }

    protected void showuserpage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        userservice service=new userserviceimpl();
       List<user> list=service.query();
       request.setAttribute("userlist",list);
        request.getRequestDispatcher("/pages/manager/user_manager.jsp").forward(request,response);
    }
}
