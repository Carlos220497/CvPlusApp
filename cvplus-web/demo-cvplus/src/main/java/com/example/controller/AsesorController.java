package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.AsesorService;
import com.example.service.RubroService;

@Controller
@RequestMapping("/asesors")
public class AsesorController {

	@Autowired
	private AsesorService asesorService;

	@Autowired
	private RubroService rubroService;

	@GetMapping
	public String listarAsesores() {
		return "asesor/list";
	}

}
