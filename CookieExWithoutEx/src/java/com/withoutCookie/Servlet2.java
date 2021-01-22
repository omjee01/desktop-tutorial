/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Servlet2 extends HttpServlet{
    
    
    public void doGet(HttpServletRequest httpReq, HttpServletResponse httpRes)throws ServletException, IOException{
        System.out.println("DoGet runsssss*******");
        httpRes.setContentType("text/html");
        
        PrintWriter out = httpRes.getWriter();
        
        //Getting all the cookies from the respose of Servlet1 i.e. WithoutCookie class
         Cookie[] cookies = httpReq.getCookies();
        String name=null;
         if(cookies==null){
             out.println("A new request");
         } else {
             for(Cookie c :cookies){
                  //String tname =c.getName();
                 if(c.getName().equals("user_name")){
                      name = c.getValue();
                 }
             }
         }
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet-1 </title>");
        out.println("</head>");
        out.println("<body>");
        //String name =httpReq.getParameter("name");
        out.println("<h1>Hello "+name+" welcome back to websire</h1>");
        out.println("</body>");
        out.println("</html>");
        out.print(new Date().toString());
    }
    
}
