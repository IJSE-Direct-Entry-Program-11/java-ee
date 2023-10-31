package lk.ijse.dep11.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/customers")
public class CustomerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:15000/dep11_smart_pos",
                            "postgres", "postgres");
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM customer");

            resp.setContentType("text/html");
            resp.getWriter().println("<h1>Customers</h1>");
            resp.getWriter().println("<table style=\"border: 1px solid black\">");
            resp.getWriter().println("<tr>" +
                    "<th>ID</th>" +
                    "<th>NAME</th>" +
                    "<th>ADDRESS</th>" +
                    "</tr>");
            while (rst.next()){
                String id = rst.getString("id");
                String name = rst.getString("name");
                String address = rst.getString("address");
                resp.getWriter().println("<tr>");
                resp.getWriter().printf("<td>%s</td>", id);
                resp.getWriter().printf("<td>%s</td>", name);
                resp.getWriter().printf("<td>%s</td>", address);
                resp.getWriter().println("</tr>");
            }
            resp.getWriter().println("</table>");
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CustomerServlet: doHead()");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CustomerServlet: doPost()");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CustomerServlet: doPut()");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CustomerServlet: doDelete()");
        resp.setStatus(404);
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Hello Machan!</h1>");
    }
}
