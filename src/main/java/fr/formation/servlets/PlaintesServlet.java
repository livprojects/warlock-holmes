package fr.formation.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.formation.models.Plainte;
import fr.formation.services.CaseCreationService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="plaintesServlet",
		urlPatterns= {"/plaintes"},
		loadOnStartup = 1)
public class PlaintesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CaseCreationService caseCreationService;


    /**
     * Default constructor. 
     */
    public PlaintesServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List <Plainte> plaintes = new ArrayList<>();
		
		// Première plainte //
		
		Plainte premierePlainte = new Plainte();
		premierePlainte.setPlaignant("La mère Michèle");
		premierePlainte.setProcesVerbal("08-09-2021 : La mère Michèle s'est fait teindre son chat, un individu dénommé Félix, en rose fuschia. Cela jure horriblement avec son pelage noir et blanc.");
		premierePlainte.setUrlIllustration("https://i.pinimg.com/originals/e5/cc/d4/e5ccd4fb842677612d9ee0644d718bbe.png");
		plaintes.add(premierePlainte);

		// Deuxième plainte // 
		
		Plainte deuxiemePlainte = new Plainte();
		premierePlainte.setPlaignant("Coco le Nain");
		premierePlainte.setProcesVerbal("07-09-2021 : Coco le Nain, demeurant au 5 rue des Uruk Hai, s'est fait voler son gourdin. L'objet avait été offert par sa grand-mère.");
		premierePlainte.setUrlIllustration("https://cdn.vegaooparty.com/images/rep_art/gra/235/9/235927/gourdin-gonflable_235927.jpg");
		plaintes.add(deuxiemePlainte);
		
		
		request.setAttribute("complaints", plaintes);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/complaints.jsp").forward(request, response);

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
