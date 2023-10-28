package lk.ijse.dep11.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello1",
        initParams = {
                @WebInitParam(name = "app.username", value = "root"),
                @WebInitParam(name = "app.password", value = "1234")
        }, loadOnStartup = 0)
public class MyServlet1 extends HttpServlet {

    public MyServlet1() {
        System.out.println("MyServlet1()");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("MyServlet1 init()");
        System.out.println("ServletConfig: " + getServletConfig());
        System.out.println("ServletContext: " + getServletConfig().getServletContext());
        System.out.println("Servlet Specific Init Parameters");
        System.out.println("app.username:" + getServletConfig().getInitParameter("app.username"));
        System.out.println("app.password:" + getServletConfig().getInitParameter("app.password"));
        System.out.println("dep.batch:" + getServletConfig().getInitParameter("dep.batch"));
        System.out.println("Context Params");
        System.out.println("app.name: " + getServletConfig().getServletContext().getInitParameter("app.name"));
        System.out.println("app.version: " + getServletConfig().getServletContext().getInitParameter("app.version"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>MyServlet1</h1>");
    }
}
