package com.company.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.webapp.model.LoginDTO;

@Controller
@RequestMapping("webapp")
public class SampleController {

	@GetMapping("")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("logindto", new LoginDTO());
		return mv;
	}
	
	@PostMapping("")
	public String doLogin(LoginDTO dto, Errors errors, RedirectAttributes attributes) {
		
		if(!dto.getLogin().equals("login@mail.com") || !dto.getPass().equals("pass")){
			return "redirect:/webapp";
		}

		try {
			return "redirect:/webapp/home";
		}catch(IllegalArgumentException exception) {
			return "login";
		}
		
	}
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
}
