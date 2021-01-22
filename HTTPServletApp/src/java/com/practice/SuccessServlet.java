package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

/**
 *
 * @author avinash.k
 */
public class SuccessServlet extends HttpServlet{
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<h2>Successfully submitter</h2><br><h3>Successfully forwared from parent servlet as well </h3>");
    }
            
            
    
}
