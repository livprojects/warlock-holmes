package fr.formation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Complaint;
import fr.formation.repository.ComplaintRepository;


@RestController
@RequestMapping("/complaints")
public class ComplaintController  {

	@Autowired
	private final ComplaintRepository complaintRepository = null;
	
	@GetMapping("/test")
	public List<Complaint> getAll(){
		System.out.println("Arrivée dans le controller");
		List<Complaint> plaintes = complaintRepository.getAll();
		System.out.println("TEST PLAINTES - " + plaintes);
		return complaintRepository.getAll();
	}

	@GetMapping("/suspects/{id}")
	public Optional<Complaint> get(@RequestBody Complaint complaint, @PathVariable int id){
		return complaintRepository.get(id);
	}
	
	// TODO Add et update ? Or not ?

	// TODO Pondérer si on fait ça en int ou objet
//	@PostMapping("/suspects/{id}")
//	public void remove(@PathVariable int id) {
//
//		// TODO Handle exception
//		if (complaintRepository.get(id).isEmpty())
//			System.out.println("Erreur - Tentative de suppression d'un SUSPECT n'existant pas");
//		
//		// Le premier get récupère le suspect, le second récupère le Suspect, pas le Optional<Suspect>
//		Suspect actualSuspect = complaintRepository.get(id).get();
//
//		complaintRepository.remove(actualSuspect);
//	}

}
