package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author avinash.k
 */
public class MyServlet extends HttpServlet{
    
    
    public void doGet(HttpServletRequest httpReq, HttpServletResponse httpRes)throws ServletException, IOException{
        System.out.println("DoGet runsssss*******");
        httpRes.setContentType("text/html");
        
        PrintWriter out = httpRes.getWriter();
        
        out.print("<h3>Maaa lyf maa rulzzzzzzz</h3><br><h3>Done exec with HTTPSERVLET Fuckaaaa</h3>");
        out.print(new Date().toString());
    }
}
