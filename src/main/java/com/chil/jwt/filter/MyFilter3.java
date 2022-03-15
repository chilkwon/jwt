package com.chil.jwt.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter3 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //DownCasting ServletRequest and ServletResponse
        HttpServletRequest req =(HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        // what if:I created token named "corse"
        if(req.getMethod().equals("POST")){
            System.out.println("POST Request");
            String headerAuth = req.getHeader("Authorization");
            System.out.println(headerAuth);
            System.out.println("Filter 3");
            if(headerAuth.equals("corse")){
                chain.doFilter(req,res);
            }else{
                PrintWriter out = res.getWriter();
                out.println("no authorized");

            }
        }
    }
}
