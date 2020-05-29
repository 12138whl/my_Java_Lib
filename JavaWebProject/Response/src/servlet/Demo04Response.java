package servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo04Response")
public class Demo04Response extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取流对象之前，设置流的默认编码: IS0-8859-1 设置为: GBK
        response.setCharacterEncoding("utf-8");
        //告诉浏览器，服务器发送的消息体数据的编码。建议浏览器使用该编码解码
        response.setHeader("content-type", "text/html ; charset=utf-8");
        //简单的形式，设置编码
        response.setContentType("text/htm1 ; charset=utf-8");


        //1.获取字符输出流
        ServletOutputStream sos = response.getOutputStream();
        //2.输出数据
        sos.write("hello你好".getBytes("utf-8"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}