package hello.servlet.basic;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest request,  HttpServletResponse response)
    throws ServletException, IOException{

        System.out.println("HelloServlet.service");
        System.out.println("Request" + request);
        System.out.println("Response" + response);



        String username = request.getParameter("username");
        System.out.println("Username " + username);

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("Username " + username);
    }
}
