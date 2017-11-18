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

@WebServlet("hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// provide your code here
        PrintWriter writer = resp.getWriter();
        writer.println("Krzysztof Muller");

//        UsersRepositoryDao usersRepositoryDao = new UsersRepositoryDaoBean();

//        resp.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = resp.getWriter();
//        writer.println("<!DOCTYPE html><html><body>");
    }

}
