
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/*")
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("LoggingFilter initialise ");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        System.out.println("Request URL: " + req.getRequestURL());

        chain.doFilter(request, response);

        System.out.println("Request processing finished");
    }

    @Override
    public void destroy() {
        System.out.println("LoggingFilter destroyed");
    }
}
