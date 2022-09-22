package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.refeicao.almoco.Almoco;
import br.infnet.infnetfood.domain.service.launch.LaunchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/food/v1/launch")
public class LaunchController {

    private final LaunchService launchService;

    public LaunchController(final LaunchService launchService) {
        this.launchService = launchService;
    }

    @GetMapping(value = "/register")
    public String signUp() {
        return "almoco/cadastro";
    }

    @PostMapping
    public String create(final Almoco almoco, final String message) {
        launchService.create(almoco, message);
        return "redirect:launch/";
    }

    @GetMapping
    public String getAll(final Model model) {
        model.addAttribute("listagem", launchService.getAll());
        return "almoco/lista";
    }

    @GetMapping("/{id}/delete")
    public String remove(@PathVariable final Integer id) {
        launchService.remove(id);
        return "redirect:/food/v1/launch/";
    }
}
