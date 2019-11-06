package com.lti;


import com.lti.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddUserController
 */
@WebServlet("/AddMovieController")
public class AddMovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMovieController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String actor=request.getParameter("actor");
		String actress=request.getParameter("actress");
		String director=request.getParameter("director");
		int collection=Integer.parseInt(request.getParameter("collection"));
		String date_of_release=request.getParameter("date_of_release");
		
		Movie m=new Movie();
		m.setId(id);
		m.setName(name);
		m.setActor(actor);
		m.setActress(actress);
		m.setDirector(director);
		m.setCollection(collection);
		m.setDate_of_release(date_of_release);
		
		MovieDAO movieDao=new MovieDAO();
		String result=movieDao.addMovie(m);
		
		if(result.equals(Results.SUCCESS))
		{
			session.setAttribute("name",m.getName());
			RequestDispatcher rd=request.getRequestDispatcher("/movieSuccess.jsp");
			rd.forward(request, response);
		}
		
	}

}
