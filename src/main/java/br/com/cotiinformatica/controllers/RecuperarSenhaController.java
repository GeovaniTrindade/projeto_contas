package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecuperarSenhaController {

	@RequestMapping(value = "/recuperar-senha")
	public ModelAndView recuperarSenha() {

		// WEB-INF/views/recuperar-senha.jsp (nome da pagina jsp que o metodo interage)
		ModelAndView modelAndView = new ModelAndView("recuperar-senha");
		return modelAndView;

	}
}
