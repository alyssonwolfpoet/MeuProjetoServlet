package br.com.alysson;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
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
//		doGet(request, response);
		String nomeUsuario = request.getParameter("usuario");
		String senhaUsuario = request.getParameter("senha");
				
		
		PrintWriter out = response.getWriter();
		
		if (nomeUsuario.equals("admin")  && senhaUsuario.equals("123"))
		{
		request.getSession().setAttribute("usuario",nomeUsuario);
		response.sendRedirect("email.jsp");
		} else
		{
		RequestDispatcher dispatcher = request.getRequestDispatcher("formlogin.html");
	  	dispatcher.forward(request, response);	
		}
	}

}
