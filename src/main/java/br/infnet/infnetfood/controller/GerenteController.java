package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/food/v1/manager")
public class GerenteController {
    public static List<Gerente> lists = new ArrayList<>();

    public static void addManager(final Gerente gerente) {
        lists.add(gerente);
        gerente.impressao();
    }

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("listagem", lists);
        return "gerente/lista";
    }
}
