package br.com.ifpb.si.pwebii.atividade01qst10.questao.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import br.com.ifpb.si.pwebii.atividade01qst10.questao.model.MegaSena;
//import br.com.ifpb.si.pwebii.atividade01qst10.questao.repository.MegaSenaRepository;

@Controller
@RequestMapping("/megasena")
public class MegaSenaController {
	
	// @Autowired
	// MegaSenaRepository megasenaRepository;

	@RequestMapping("/form")
	public String getForm(Model model, MegaSena megasena) {
		model.addAttribute("megasena", megasena);
		return "megasena/form";
	}

	@RequestMapping("/save")
	public String save(Model model, MegaSena megasena){
		//megasenaRepository.save(megasena);
		MegaSena mega_sena = megasena;
		mega_sena.geraNumerosAleatorios();
		model.addAttribute("megasena", megasena);
		return "megasena/list";
	}
}
