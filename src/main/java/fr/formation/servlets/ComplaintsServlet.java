package fr.formation.servlets;

import java.io.IOException;

import fr.formation.services.CaseCreationService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ComplaintsServlet
 */

@WebServlet(
        name = "ComplaintsServlet",
        urlPatterns = {"/complaints"},
        loadOnStartup = 1
)
public class ComplaintsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public CaseCreationService caseCreationService;


    public ComplaintsServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ca passe dans la servlet");
		request.setAttribute("complaints", caseCreationService.genererPlaintes());
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/complaints.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
