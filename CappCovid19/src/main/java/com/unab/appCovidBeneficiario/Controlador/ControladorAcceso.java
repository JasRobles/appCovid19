package com.unab.appCovidBeneficiario.Controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.appCovidBeneficiario.DAO.ClsPersona;
import com.appCovidBeneficiario.Entidades.personas;

/**
 * Servlet implementation class ControladorAcceso
 */
@WebServlet("/ControladorAcceso")
public class ControladorAcceso extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorAcceso() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		HttpSession session = request.getSession(true);
		String btnConsultar = request.getParameter("btnConsultar");
		if (btnConsultar != null) {
			response.sendRedirect("Index.jsp");
			session.invalidate();
		}
		String dui = request.getParameter("dui");
		if (dui.length() == 10) {
			personas pers = new personas();
			pers.setDui(dui);
			ClsPersona cls = new ClsPersona();
			ArrayList<personas> persona = cls.persona(pers);
			if (persona.size() == 1) {
				for (var iterar : persona) {
					request.getSession().setAttribute("nombre", iterar.getNombre());
					request.getSession().setAttribute("apellido", iterar.getApellido());
					request.getSession().setAttribute("direccion", iterar.getDireccion());
					request.getSession().setAttribute("Index", "Index");
				}
				response.sendRedirect("Beneficiario.jsp");
			} else {
				request.getSession().setAttribute("nombre", "Index");
				request.getSession().setAttribute("Index", "NoBeneficiario");
				response.sendRedirect("NoBeneficiario.jsp");
			}

		} else {

			response.sendRedirect("Index.jsp");
		}

	}

}
