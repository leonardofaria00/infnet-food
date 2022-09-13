package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import br.infnet.infnetfood.domain.service.manager.GerenteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/food/v1/manager")
public class GerenteController {

    private final GerenteService service;

    public GerenteController(final GerenteService service) {
        this.service = service;
    }

    @GetMapping(value = "/signup")
    public String signUp() {
        return "gerente/cadastro";
    }

    @PostMapping
    public String create(final Gerente gerente) {
        service.create(gerente);
        return "redirect:manager/";
    }

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("listagem", service.getList());
        return "gerente/lista";
    }

    @GetMapping("/{matricula}/delete")
    public String delete(@PathVariable final Integer matricula) {
        service.remove(matricula);
        return "redirect:/food/v1/manager/";
    }
}
