package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.refeicao.almoco.Almoco;
import br.infnet.infnetfood.domain.service.launch.LaunchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/food/v1/launch")
public class LaunchController {

    private final LaunchService launchService;

    public LaunchController(final LaunchService launchService) {
        this.launchService = launchService;
    }


    public void create(final Almoco almoco, final String message) {
        launchService.create(almoco, message);
    }

    @GetMapping
    public String getAll(final Model model) {
        model.addAttribute("listagem", launchService.getAll());
        return "almoco/lista";
    }

    @GetMapping("/{uuid}/delete")
    public String remove(@PathVariable final String uuid) {
        launchService.remove(uuid);
        return "redirect:/food/v1/launch/";
    }
}
