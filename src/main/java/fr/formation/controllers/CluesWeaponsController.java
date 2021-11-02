package fr.formation.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Clue;

@RestController
@RequestMapping("clues")
public class CluesWeaponsController {
	
	// CONTROLLER DES INDICES

	
	@GetMapping("/list")
	public List <Clue> getAll() {
		//TODO
		return null;
		
	}
	
    @GetMapping("/{id}")
	public Clue getOne(UUID id) {
		//TODO Appel DAO
		return null;
	}

}
