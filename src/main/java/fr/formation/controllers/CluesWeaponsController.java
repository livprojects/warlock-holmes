package fr.formation.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Indice;

@RestController
@RequestMapping("/api/clues")
public class CluesWeaponsController {
	
	@GetMapping("/test")
	public String test() {
		return "coucou";
	}
	
    @GetMapping("/id")
	public Indice findOne(UUID id) {
		return null;
		//TODO Appel DAO
	}

}
