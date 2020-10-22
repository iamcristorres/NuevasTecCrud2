package co.edu.konrad.crudusuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.konrad.crudusuarios.model.Asignatura;
import co.edu.konrad.crudusuarios.service.api.AsignaturaServiceAPI;

@Controller
public class AsignaturaController {
	
	@Autowired
	private AsignaturaServiceAPI asignaturaServiceAPI;
	
	@RequestMapping("/asignatura")
	public String index(Model model) {
		model.addAttribute("list", asignaturaServiceAPI.getAll());
		return "asignatura";
	}
	
	@GetMapping("/savea/{id}")
	public String viewSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("asignatura", asignaturaServiceAPI.get(id));
		} else {
			model.addAttribute("asignatura", new Asignatura());
		}
		return "savea";
	}
	
	@PostMapping("/savea")
	public String save(Asignatura asignatura) {
		asignaturaServiceAPI.save(asignatura);
		return "redirect:/asignatura";
	}
	@GetMapping("deletea/{id}")
	public String delete(@PathVariable("id") Long id) {
		asignaturaServiceAPI.delete(id);
		return "redirect:/asignatura";
	}
}
