package lk.ijse.dep11.web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customers", loadOnStartup = 10)
public class CustomerServlet extends HttpServlet {

//    static {
//        System.out.println("Customer Servlet is being initialized: " + Thread.currentThread().getName());
//    }
//
//    public CustomerServlet() {
//        System.out.println("Customer Servlet: Constructor: " + Thread.currentThread().getName());
//        System.out.println("Servlet Config: " + getServletConfig());
//        try {
//            System.out.println("Servlet Context: " + getServletContext());
//        }catch (Exception e){
//            System.out.println("Exception: " + e.getMessage());
//        }
//    }
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        System.out.println("init(ServletConfig) " + Thread.currentThread().getName());
//        try {
//            System.out.println("Servlet Context: " + getServletContext());
//        }catch (Exception e){
//            System.out.println("Exception: " + e.getMessage());
//        }
//        super.init(config);
//        System.out.println("Servlet Config: " + getServletConfig());
//        System.out.println("Servlet Context: " + getServletContext());
//    }

    @Override
    public void init() throws ServletException {
        System.out.println("Customer Servlet: init() " + Thread.currentThread().getName());
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service(ServletRequest, ServletResponse) " + Thread.currentThread().getName());
        super.service(req, res);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service(HttpServletRequest, HttpServletResponse) " + Thread.currentThread().getName());
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet(HttpServletRequest, HttpServletResponse) " + Thread.currentThread().getName());
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Customer Servlet</h1>");
        resp.getWriter().println("ContextPath: " + req.getContextPath() + "<br>");
        resp.getWriter().println("ServletPath: " + req.getServletPath() + "<br>");
        resp.getWriter().println("PathInfo: " + req.getPathInfo() + "<br>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() " + Thread.currentThread().getName());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() " + Thread.currentThread().getName());
    }
}
