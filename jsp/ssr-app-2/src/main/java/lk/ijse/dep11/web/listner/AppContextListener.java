package lk.ijse.dep11.web.listner;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.File;
import java.sql.SQLException;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String appPath = sce.getServletContext().getRealPath("/");
        new File(appPath, "uploads").mkdir();

        BasicDataSource pool = new BasicDataSource();
        pool.setUsername("root");
        pool.setPassword("mysql");
        pool.setDriverClassName("com.mysql.cj.jdbc.Driver");
        pool.setUrl("jdbc:mysql://localhost:3306/dep11_ssr_app_2");
        pool.setInitialSize(5);
        pool.setMaxTotal(15);

        sce.getServletContext().setAttribute("connectionPool", pool);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            ((BasicDataSource) sce.getServletContext().getAttribute("connectionPool")).close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
