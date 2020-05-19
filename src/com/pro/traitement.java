package com.pro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class traitement
 */
@WebServlet("/traitement")
public class traitement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public traitement() {
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
		//System.out.println(profile.password);
		//System.out.println(profile.confirmpassword);

		if(profile.password.equals(profile.confirmpassword)) {
			request.getRequestDispatcher("addcard.jsp").forward(request, response);
			RequestDispatcher rd=request.getRequestDispatcher("addcard.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("error");
			request.getRequestDispatcher("Identification.jsp").forward(request, response);
			
		}
			
		doGet(request, response);
	}

}
