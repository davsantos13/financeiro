package com.financeiro.titulo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TituloController {

	private final String INDEX = "index";

	@RequestMapping(value = "/")
	public String inicio() {
		return INDEX;
	}
}
