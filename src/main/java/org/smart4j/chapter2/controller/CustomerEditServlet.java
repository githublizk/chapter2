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
@WebServlet("/customer_edit")
public class CustomerEditServlet extends HttpServlet{

    /**
     * 进入 编辑客户 界面
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO
    }

    /**
     * 处理 编辑客户 请求
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO
    }
}
