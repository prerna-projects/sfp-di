package com.spring.sfpdi.controllers;

import org.springframework.stereotype.Controller;

import com.springframework.pets.PetService;

@Controller
public class PetController {

	private final PetService petService;

	public PetController(PetService petService) {
		super();
		this.petService = petService;
	}
	
	public String whichPetIsTheBest() {
		
		return petService.getType();
	}
	
}
