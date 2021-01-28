package org.acme.servlet;

import javax.servlet.http.*;

import org.acme.rest.client.AnimalsResource;

import javax.servlet.*;
import java.io.*;

public class MyServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException,IOException{
        //Grab input
        String animal = req.getParameter("animal");
        PrintWriter pw = res.getWriter();//get the stream to write the data
        res.setContentType("text/html");//setting the content type
        AnimalsResource resource = new AnimalsResource();
        String htmlResponseData;

        if(animal.equals("all"))
            htmlResponseData = resource.all().toString();
        else
            htmlResponseData = resource.name(animal).toString();
        
        pw.println("JSON data: " + htmlResponseData);
    }
}
