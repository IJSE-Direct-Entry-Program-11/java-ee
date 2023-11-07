package lk.ijse.dep11.az;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "MyServlet", urlPatterns = "", loadOnStartup = 0,
    initParams = @WebInitParam(name = "s-param", value = "Hello Servlet"))
public class MyServlet extends HttpServlet {

    static {
        System.out.println("MyServlet Class Object is being initialized");
    }

    public MyServlet() {
        System.out.println("MyServlet()");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("MyServlet:init(ServletConfig)");
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("MyServlet:init() just graduated to HttpServlet");
    }
}
