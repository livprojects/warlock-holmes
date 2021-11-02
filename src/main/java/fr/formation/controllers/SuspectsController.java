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

import fr.formation.models.Suspect;
import fr.formation.repository.SuspectRepository;

@RestController
@RequestMapping("/suspects")
public class SuspectsController {
	
	// CONTROLLER DES SUSPECTS


	// Basé sur https://spring.io/guides/tutorials/rest/

	@Autowired
	private final SuspectRepository suspectRepository = null;

	@GetMapping("/list")
	public List<Suspect> getAll() {
		return suspectRepository.getAll();
	}

	@GetMapping("/{id}")
	public Optional<Suspect> get(@RequestBody Suspect suspect, @PathVariable int id) {
		return suspectRepository.get(id);
	}

	// TODO Add et update ? Or not ?

	// TODO Pondérer si on fait ça en int ou objet
	@PostMapping("/{id}")
	public void remove(@PathVariable int id) {

		// TODO Handle exception
		if (suspectRepository.get(id).isEmpty())
			System.out.println("Erreur - Tentative de suppression d'un SUSPECT n'existant pas");

		// Le premier get récupère le suspect, le second récupère le Suspect, pas le
		// Optional<Suspect>
		Suspect actualSuspect = suspectRepository.get(id).get();

		suspectRepository.remove(actualSuspect);
	}

}
