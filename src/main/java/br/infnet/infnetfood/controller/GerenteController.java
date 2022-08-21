package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/food/v1/manager")
public class GerenteController {
    public static Map<Integer, Gerente> map = new HashMap<>();

    public static void addManager(final Gerente gerente) {
        map.put(gerente.getMatricula(), gerente);
        gerente.impressao();
    }

    public static Collection<Gerente> getList() {
        return map.values();
    }

    public static void deleteManager(final Integer matricula) {
        map.remove(matricula);
        System.out.printf("Deleted registry: %s%n", matricula);
    }

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("listagem", getList());
        return "gerente/lista";
    }

    @GetMapping("/{matricula}/delete")
    public String delete(@PathVariable final Integer matricula) {
        deleteManager(matricula);
        return "redirect:/food/v1/manager/";
    }
}
