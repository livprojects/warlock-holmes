package fr.formation.services;

import java.util.ArrayList;
import java.util.List;

import fr.formation.models.Plainte;

public class CaseCreationService {
	
	public List <Plainte> genererPlaintes() {
		
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
		
		System.out.println("PLAINTES - " + plaintes);
		return plaintes;
		
	}

}
