package lk.ijse.dep11.web;

import lk.ijse.dep11.web.to.Customer;
import lk.ijse.dep11.web.to.Item;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({"/items"})
public class ItemServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            BasicDataSource pool = (BasicDataSource) getServletContext().getAttribute("connectionPool");
            Connection connection = pool.getConnection();
            ResultSet rst = connection.createStatement().executeQuery("SELECT * FROM item");
            List<Item> itemList = new ArrayList<>();
            while (rst.next()){
                String code = rst.getString("code");
                String description = rst.getString("description");
                int qty = rst.getInt("qty");
                BigDecimal unitPrice = rst.getBigDecimal("unit_price");
                itemList.add(new Item(code, description, qty, unitPrice));
            }
            connection.close();     // close => release
            req.setAttribute("itemList", itemList);
            getServletContext().getRequestDispatcher("/WEB-INF/items.jsp").forward(req,resp);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
