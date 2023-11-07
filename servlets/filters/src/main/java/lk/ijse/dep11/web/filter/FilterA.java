package lk.ijse.dep11.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterA extends HttpFilter {

    {
        System.out.println("FilterA Class is being initialized: " + Thread.currentThread().getName());
    }

    public FilterA() {
        System.out.println("FilterA Constructor: " + Thread.currentThread().getName());
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("FilterA init(FilterConfig): " + Thread.currentThread().getName());
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("FilterA init(): " + Thread.currentThread().getName());
    }

    @Override
    public void destroy() {
        System.out.println("FilterA destroy(): " + Thread.currentThread().getName());
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter(S.R, S.Res)");
        super.doFilter(req, res, chain);
    }

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter(H.S.R,H.S.Res)");
        System.out.println("Filter A: Incoming: " + Thread.currentThread().getName());
        chain.doFilter(req, res);
        System.out.println("Filter A: Outgoing");
    }
}
