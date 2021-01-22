
package com.withoutCookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author avinash.k
 */
public class WithoutCookie extends HttpServlet{
    
    
    public void doGet(HttpServletRequest httpReq, HttpServletResponse httpRes)throws ServletException, IOException{
        System.out.println("DoGet runsssss*******");
        httpRes.setContentType("text/html");
        
        PrintWriter out = httpRes.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet-1 </title>");
        out.println("</head>");
        out.println("<body>");
        String name =httpReq.getParameter("name");
        out.println("<h1>Hello "+name+" welcome to websire</h1>");
        out.println("<h1><a href='servlet2'> Go to servlet 2 </a></h1>");
        
        // Create a cookie
        
        Cookie cookie = new Cookie("user_name", name);
        
        //Adding the cookie into respose of servlet1 for the Servlet2
        
        httpRes.addCookie(cookie);
        out.println("</body>");
        out.println("</html>");
        out.print(new Date().toString());
    }
    
    
    
}
