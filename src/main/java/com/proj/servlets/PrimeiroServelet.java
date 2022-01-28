package com.proj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/PrimeiroServelet")
public class PrimeiroServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeiroServelet() {
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

		 process3(request, response);
	} 
	
	
	private void process3 (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if((request.getParameter("valor1") != null) && (request.getParameter("valor2") != null)) {
		
			int valor1 = Integer.parseInt(request.getParameter("valor1"));
			int valor2 = Integer.parseInt(request.getParameter("valor2"));
			

			Calcular calc = new Calcular(valor1,valor2); 
			int resultado;
			
			
			if(request.getParameter("mais") != null) {
				 resultado = calc.somar();
			} else if (request.getParameter("menos") != null) {
				 resultado = calc.subtrair();
			}else if (request.getParameter("vezes") != null) {
				 resultado = calc.multiplicar();
			}else {
				resultado = calc.dividir();
			}
			

			request.setAttribute("resultado", resultado); 
	
		}
		request.getRequestDispatcher("/").forward(request, response);
	} 
	

}