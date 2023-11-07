package lk.ijse.dep11.az;

import javax.servlet.*;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyFilter extends HttpFilter {

    static{
        System.out.println("MyFilter Class Object is being initialized");
    }

    public MyFilter() {
        System.out.println("MyFilter()");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("MyFilter:init(FilterConfig)");
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("MyFilter:init() just graduated to a HttpFilter");
        System.out.println(getServletContext());
        String filterParam1Value = getFilterConfig().getInitParameter("filter-param1");
        String filterParam2Value = getFilterConfig().getInitParameter("filter-param2");
        System.out.println(filterParam1Value);
        System.out.println(filterParam2Value);
    }

}
