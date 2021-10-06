package fr.formation.controllers;

import java.io.IOException;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Indice;



@RestController
@RequestMapping("/clues")
public class CluesWeaponsController {
	

    @GetMapping("/id")
	private Indice findOne(UUID id) {
		return null;
		//TODO Appel DAO
	}

}
