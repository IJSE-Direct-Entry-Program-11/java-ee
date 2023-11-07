package lk.ijse.dep11.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/my")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>My Servlet</h1>");
        getServletContext().getRequestDispatcher("/other").forward(req, resp);
//        resp.sendRedirect("https://google.lk");
//        resp.sendRedirect("/app/other");
    }
}
