package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.refeicao.janta.Janta;
import br.infnet.infnetfood.domain.data.printer.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/food/v1/dinner")
public class DinnerController {

    public static Map<String, Janta> map = new HashMap<>();

    public static void addDinner(final Janta janta, final String message) {
        map.put(janta.getUuid(), janta);
        AppImpressao.relatorio(message, janta);
    }

    public static Collection<Janta> getList() {
        return map.values();
    }

    private static void removeDinner(final String uuid) {
        map.remove(uuid);
        System.out.printf("Deleted uuid: %s%n", uuid);
    }

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("listagem", getList());
        return "janta/lista";
    }

    @GetMapping("/{uuid}/delete")
    public String delete(@PathVariable final String uuid) {
        removeDinner(uuid);
        return "redirect:/food/v1/dinner/";
    }
}
