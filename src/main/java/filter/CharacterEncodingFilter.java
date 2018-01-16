package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * \Date: 2018/1/16
 * \
 * \Description:
 * \
 */

public class CharacterEncodingFilter implements Filter{

    private FilterConfig filterConfig;

    public FilterConfig getFilterConfig() {
        return filterConfig;
    }

    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("CharacterEncodingFilter");
        this.filterConfig=filterConfig;
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("do()");

//        String s=filterConfig.getInitParameter("name");
//        System.out.println(s);

        String s=filterConfig.getInitParameter("charset");
        servletRequest.setCharacterEncoding(s);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {
        System.out.println("destroy().....CharacterEncodingFilter");



    }

}
