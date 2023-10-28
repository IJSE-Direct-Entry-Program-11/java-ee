package lk.ijse.dep11.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "ItemServlet", urlPatterns = "/items", loadOnStartup = 5)
public class ItemServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Item Servlet: init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Item Servlet</h1>");
        resp.getWriter().println("ContextPath: " + req.getContextPath() + "<br>");
        resp.getWriter().println("ServletPath: " + req.getServletPath() + "<br>");
        resp.getWriter().println("PathInfo: " + req.getPathInfo() + "<br>");
    }
}
