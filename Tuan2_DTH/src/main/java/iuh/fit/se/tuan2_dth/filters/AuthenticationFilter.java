package iuh.fit.se.tuan2_dth.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AuthenticationFilter extends HttpFilter implements Filter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        String userNameConfig = this.getFilterConfig().getInitParameter("username");
        String passwordConfig = this.getFilterConfig().getInitParameter("password");

        String userNameRequest = req.getParameter("username");
        String passwordRequest = req.getParameter("password");

        if(userNameRequest.equals(userNameConfig) && passwordRequest.equals(passwordConfig)) {
            chain.doFilter(req, res);
        } else {
            res.setContentType("text/plain;charset=UTF-8");
            res.getWriter().println("Sai username hoặc password");
        }
    }
}
