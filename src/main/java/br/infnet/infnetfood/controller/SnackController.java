package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.refeicao.petisco.Petisco;
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
@RequestMapping("/food/v1/snack")
public class SnackController {

    public static Map<String, Petisco> map = new HashMap<>();

    public static void addSnack(final Petisco petisco, final String message) {
        map.put(petisco.getUuid(), petisco);
        AppImpressao.relatorio(message, petisco);
    }

    public static Collection<Petisco> getList() {
        return map.values();
    }

    private static void removeSnack(final String uuid) {
        map.remove(uuid);
        System.out.printf("Deleted uuid: %s%n", uuid);
    }

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("listagem", getList());
        return "petisco/lista";
    }

    @GetMapping("/{uuid}/delete")
    public String delete(@PathVariable final String uuid) {
        removeSnack(uuid);
        return "redirect:/food/v1/snack/";
    }
}
