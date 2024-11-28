package com.servlet.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("In Service..");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2><i>Hello World</i></h2>");
    }
}
