package lk.ijse.dep11.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener {

    public MyContextListener() {
        System.out.println("MyContextListener()");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        System.out.println("Context Initialized: " + context);
        System.out.println("Context Parameters");
        System.out.println("app.name: " + context.getInitParameter("app.name"));
        System.out.println("app.version: " + context.getInitParameter("app.version"));
    }
}
