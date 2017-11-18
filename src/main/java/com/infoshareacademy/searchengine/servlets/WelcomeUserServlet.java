package com.infoshareacademy.searchengine.servlets;


import com.infoshareacademy.searchengine.dao.UsersRepositoryDao;
import com.infoshareacademy.searchengine.dao.UsersRepositoryDaoBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;

@WebServlet("welcome-user")
public class WelcomeUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// provide your code here
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();


        String requestNameParameter = req.getParameter("name");


        if (requestNameParameter != null) {
            writer.println("<!DOCTYPE html><html><body>" +
                    requestNameParameter +
                    "!</body></html>");
        } else {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);

        }


//        resp.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = resp.getWriter();
//        writer.println("<!DOCTYPE html><html><body>");
    }

}
