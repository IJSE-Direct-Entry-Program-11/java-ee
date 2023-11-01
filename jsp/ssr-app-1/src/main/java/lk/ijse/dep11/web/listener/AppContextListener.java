package lk.ijse.dep11.web.listener;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.SQLException;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        BasicDataSource pool = new BasicDataSource();
        pool.setUsername("postgres");
        pool.setPassword("postgres");
        pool.setUrl("jdbc:postgresql://localhost:15000/dep11_smart_pos");
        pool.setDriverClassName("org.postgresql.Driver");
        pool.setInitialSize(10);
        pool.setMaxTotal(20);
        sce.getServletContext().setAttribute("connectionPool", pool);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        BasicDataSource pool = (BasicDataSource) sce.getServletContext()
                .getAttribute("connectionPool");
        try {
            pool.close();
        } catch (SQLException e) {
            // Do nothing
        }
    }
}
