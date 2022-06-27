package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.models.PaginaWeb;



@Controller
@RequestMapping("/index")

public class WebControllers {
	public String index(Model model) {	
			
		model.addAttribute("granada","aaaaaaaaaaaaaaa, El rodeo estadounidense, es popular hoy en día\r\n"
				+ "            dentro de la provincia canadiense de Alberta y en todo el oeste de\r\n"
				+ "            los Estados Unidos, es el deporte oficial del estado de Wyoming,\r\n"
				+ "            Dakota del Sur y Texas.");
		
		return "index"; /*página que retornará*/
	}
}
