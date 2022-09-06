package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.refeicao.janta.Janta;
import br.infnet.infnetfood.domain.service.dinner.DinnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/food/v1/dinner")
public class DinnerController {

    private final DinnerService dinnerService;

    public DinnerController(final DinnerService dinnerService) {
        this.dinnerService = dinnerService;
    }

    public void create(final Janta janta, final String message) {
        dinnerService.create(janta, message);
    }

    @GetMapping
    public String getAll(final Model model) {
        model.addAttribute("listagem", dinnerService.getAll());
        return "janta/lista";
    }

    @GetMapping("/{uuid}/delete")
    public String remove(@PathVariable final String uuid) {
        dinnerService.remove(uuid);
        return "redirect:/food/v1/dinner/";
    }
}
