package lk.ijse.dep11.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servlet-a", name = "ServletA")
public class ServletA extends HttpServlet {

    static {
        System.out.println("ServletA Class is being initialized");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("ServletA initialized");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletA: doGet()");
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Servlet A</h1>");
    }
}
