package lk.ijse.dep11.az.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Enumeration;

@WebListener
public class AppContextListener implements ServletContextListener {

    static {
//      1  ServletContextListener
//      2  ServletRequestListener
//      3  HttpSessionListener
//      4  ServletContextAttributeListener
//      5  ServletRequestAttributeListener
//      6  HttpSessionAttributeListener
        System.out.println("AppContextListener Class Object is being initialized");
    }

    public AppContextListener() {
        System.out.println("AppContextListener()");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext has been just initialized: " + sce.getServletContext());
        String param1Value = sce.getServletContext().getInitParameter("param1");
        String param2Value = sce.getServletContext().getInitParameter("param2");
        System.out.println("param1: " + param1Value);
        System.out.println("param2: " + param2Value);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext has been destroyed (not in service anymore): " + sce.getServletContext());
    }
}
