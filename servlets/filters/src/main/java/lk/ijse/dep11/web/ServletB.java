package lk.ijse.dep11.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servlet-b", name="ServletB")
public class ServletB extends HttpServlet {

    static {
        System.out.println("ServletB Class is being initialized");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("ServletB initialized");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletB: doGet()");
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Servlet B</h1>");
    }
}
