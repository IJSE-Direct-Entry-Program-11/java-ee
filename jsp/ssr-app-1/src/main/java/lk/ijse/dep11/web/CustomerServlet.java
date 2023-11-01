package lk.ijse.dep11.web;

import lk.ijse.dep11.web.to.Customer;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({"/customers"})
public class CustomerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            BasicDataSource pool = (BasicDataSource) getServletContext().getAttribute("connectionPool");
            Connection connection = pool.getConnection();
            ResultSet rst = connection.createStatement().executeQuery("SELECT * FROM customer");
            List<Customer> customerList = new ArrayList<>();
            while (rst.next()){
                String id = rst.getString("id");
                String name = rst.getString("name");
                String address = rst.getString("address");
                customerList.add(new Customer(id, name, address));
            }
            connection.close();     // close => release
            req.setAttribute("customerList", customerList);
            getServletContext().getRequestDispatcher("/WEB-INF/customers.jsp").forward(req,resp);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
