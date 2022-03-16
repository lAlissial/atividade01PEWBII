package br.com.ifpb.si.pwebii.atividade01qst10.questao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import br.com.ifpb.si.pwebii.atividade01qst10.questao.model.MegaSena;
import br.com.ifpb.si.pwebii.atividade01qst10.questao.repository.MegaSenaRepository;

@Controller
@RequestMapping("/megasena")
public class MegaSenaController {
	
	private MegaSena mega_sena;

	@RequestMapping("/form")
	public ModelAndView getForm(Model model MegaSena megasena) {
		model.addAttribute("megasena", megasena);
		return "megasena/form";
	}

	@RequestMapping("/save")
	public String save(Model model, MegaSena megasena){
		MegaSenaRepository.save(megasena);
		model.addAttribute("megasena", megasena);
		this.mega_sena = megasena;
		this.mega_sena.geraNumerosAleatorios();
		model.addAttribute("megasena", megasena);
		return "megasena/list";
	}
}
