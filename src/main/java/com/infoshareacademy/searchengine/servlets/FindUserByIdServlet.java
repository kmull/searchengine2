package com.infoshareacademy.searchengine.servlets;


import com.infoshareacademy.searchengine.dao.UsersRepositoryDao;
import com.infoshareacademy.searchengine.dao.UsersRepositoryDaoBean;
import com.infoshareacademy.searchengine.domain.User;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;

@WebServlet("find-user-by-id")
public class FindUserByIdServlet extends HttpServlet {

    @EJB
    UsersRepositoryDao usersRepositoryDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// provide your code here
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

//        UsersRepositoryDao usersRepositoryDao = new UsersRepositoryDaoBean();


        String requestNameParameter = req.getParameter("id");
        if (requestNameParameter == null) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        int id = Integer.valueOf(requestNameParameter);

        User user = usersRepositoryDao.getUserById(id);


        if (user != null) {
            writer.println("<!DOCTYPE html><html><body>" +
                    user.getName() +
                    "<BR/>" + user.getSurname() +
                    "<BR/>" + user.getAge() +
                    "!</body></html>");
        } else {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            writer.println("Nie znaleziono usera");
        }
    }
}