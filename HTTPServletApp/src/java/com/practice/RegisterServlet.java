package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author avinash.k
 */
public class RegisterServlet extends HttpServlet{

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h2>Welcome to Register Servlet</h2>");
        String name = req.getParameter("usr_name");
        String pwd =req.getParameter("usr_pwd");
        String mail = req.getParameter("usr_mail");
        String gender = req.getParameter("usr_gender");
        String courseChoice = req.getParameter("usr_course");
        String condition = req.getParameter("condition");
        
        if(condition!=null && condition.equals("checked")){
            out.println("<h2>Name : "+name+"</h2>");
            out.println("<h2>Password : "+pwd+"</h2>");
            out.println("<h2>Email : "+mail+"</h2>");
            out.println("<h2>Gender : "+gender+"</h2>");
            out.println("<h2>Course Selected : "+courseChoice+"</h2>");
            
            RequestDispatcher rd = req.getRequestDispatcher("success");//Enter the URL Pattern of the servlet you want to forward/
            rd.forward(req, resp);
        }else{
            out.print("<h2>You have not accepted Terms and Condtion</h2>");
            //Include the form again i.e. index.html
            
            //get the object of RequestDispatcher
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            
            //Include the form
            rd.include(req, resp);
            
            
        }
    }
    
    
}
