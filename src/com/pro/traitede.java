package com.pro;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class traitede
 */
@WebServlet("/traitede")
public class traitede extends HttpServlet {
	ArrayList<Profile> tab_card = new ArrayList<Profile>();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public traitede() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Profile profile = Profile.parseRequest(request);
		//System.out.println(profile.name);
		//System.out.println(profile.company);
		//System.out.println(profile.email);
		//System.out.println(profile.number);
		
		ServletContext djm= request.getSession().getServletContext();
		Object content = djm.getAttribute("document");
		if(content!=null)
		{
		tab_card.add(profile);
		}
		djm.setAttribute("document",tab_card);
		request.setAttribute("name", profile.getName());
		request.setAttribute("company", profile.getCompany());
		request.setAttribute("email", profile.getEmail());
		request.setAttribute("number", profile.getNumber());
		
		request.getRequestDispatcher("/go").forward(request, response);
		RequestDispatcher rd=request.getRequestDispatcher("/go");
		//rd.forward(request, response);
		
	}

}
