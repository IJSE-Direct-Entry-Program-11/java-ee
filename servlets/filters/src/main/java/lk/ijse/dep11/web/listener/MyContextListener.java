package lk.ijse.dep11.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener {

    public MyContextListener() {
        System.out.println("MyContextListener(): " + Thread.currentThread().getName());
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextInitialize()");
    }
}
