package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.refeicao.petisco.Petisco;
import br.infnet.infnetfood.domain.service.snack.SnackService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/food/v1/snack")
public class SnackController {

    private final SnackService snackService;

    public SnackController(final SnackService snackService) {
        this.snackService = snackService;
    }

    @GetMapping(value = "/register")
    public String signUp() {
        return "petisco/cadastro";
    }

    @PostMapping
    public String create(final Petisco petisco, final String message) {
        snackService.create(petisco, message);
        return "redirect:snack/";
    }

    @GetMapping
    public String getAll(final Model model) {
        model.addAttribute("listagem", snackService.getAll());
        return "petisco/lista";
    }

    @GetMapping("/{uuid}/delete")
    public String remove(@PathVariable final String uuid) {
        snackService.remove(uuid);
        return "redirect:/food/v1/snack/";
    }
}
