package filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * \Date: 2018/1/16
 * \
 * \Description:
 * \
 */
public class TestFilter implements Filter{
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println(">>>>>>>>TestFilter execute doFilter... ...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
