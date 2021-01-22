package com.serveletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author avinash.k
 */
public class FirstServlet implements Servlet{
    
    ServletConfig config;
    
    @Override
    public void init(ServletConfig config) {
        this.config=config;
        System.out.println("com.serveletPackage.FirstServlet.init() Servlet init....");
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("com.serveletPackage.FirstServlet.service() Processing........");
    //Set the content type of response
    res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<H2>This is Sparta!! but from the inside of the Servlet. :D </H2>");
    }
    
    @Override
    public void destroy() {
        System.out.println("Destroyed ......");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public String getServletInfo() {
        return "Servlet creation done by Avinash";
    }

    
    
}
