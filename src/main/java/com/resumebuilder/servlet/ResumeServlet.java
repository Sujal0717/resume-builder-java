package com.resumebuilder.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import com.google.gson.Gson;
import java.util.*;

@WebServlet("/createResume")
public class ResumeServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String education = request.getParameter("education");
        String experience = request.getParameter("experience");
        String skills = request.getParameter("skills");
        String template = request.getParameter("template");
        
        // Create resume object
        Map<String, Object> resumeData = new HashMap<>();
        resumeData.put("name", name);
        resumeData.put("email", email);
        resumeData.put("phone", phone);
        resumeData.put("address", address);
        resumeData.put("education", education);
        resumeData.put("experience", experience);
        resumeData.put("skills", skills);
        resumeData.put("template", template);
        
        // Store in session
        HttpSession session = request.getSession();
        session.setAttribute("resumeData", resumeData);
        
        // Forward to preview page
        request.getRequestDispatcher("/WEB-INF/jsp/preview.jsp").forward(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
    }
}
