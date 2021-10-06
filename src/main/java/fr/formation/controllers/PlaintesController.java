package fr.formation.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Plainte;
import fr.formation.services.CaseCreationService;


@RestController
@RequestMapping("/complaints")
public class PlaintesController  {

	private CaseCreationService caseCreationService;


   @GetMapping
	public List<Plainte> findAllPlaintes()  {
		return null;
		/*// TODO RANGER CA DANS LA BDD
		
		List <Plainte> plaintes = new ArrayList<>();
		
		// Premi�re plainte //
		
		Plainte premierePlainte = new Plainte();
		premierePlainte.setPlaignant("La m�re Mich�le");
		premierePlainte.setProcesVerbal("08-09-2021 : La m�re Mich�le s'est fait teindre son chat, un individu d�nomm� F�lix, en rose fuschia. Cela jure horriblement avec son pelage noir et blanc.");
		premierePlainte.setUrlIllustration("https://i.pinimg.com/originals/e5/cc/d4/e5ccd4fb842677612d9ee0644d718bbe.png");
		plaintes.add(premierePlainte);

		// Deuxi�me plainte // 
		
		Plainte deuxiemePlainte = new Plainte();
		premierePlainte.setPlaignant("Coco le Nain");
		premierePlainte.setProcesVerbal("07-09-2021 : Coco le Nain, demeurant au 5 rue des Uruk Hai, s'est fait voler son gourdin. L'objet avait �t� offert par sa grand-m�re.");
		premierePlainte.setUrlIllustration("https://cdn.vegaooparty.com/images/rep_art/gra/235/9/235927/gourdin-gonflable_235927.jpg");
		plaintes.add(deuxiemePlainte);
		
		*/
		
		
	}



}
