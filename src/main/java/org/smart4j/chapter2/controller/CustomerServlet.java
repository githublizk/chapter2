package org.smart4j.chapter2.controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Created by Lizk on 2018/6/5.
 */
/**
 * Created by Brave on 18/5/22.
 * 客户列表
 */
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO
    }
}