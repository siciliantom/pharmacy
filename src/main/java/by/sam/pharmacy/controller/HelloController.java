package by.sam.pharmacy.controller;

import by.sam.pharmacy.Performer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Kate on 22.10.2016.
 */
public class HelloController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //XmlWebApplicationContext ctx = new XmlWebApplicationContext(); //ClassPathXmlApplicationContext("spring-config.xml");
        WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
//        ctx.setConfigLocation("/WEB-INF/config/servlet-context.xml");
//        ctx.setServletContext(request.getServletContext());
//        ctx.refresh();//!!

        Performer performer = (Performer) ctx.getBean("duke");
        request.setAttribute("wow", performer.perform("beans power!!"));
        RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/show.jsp");
        dispatcher.include(request, response);
    }
}
