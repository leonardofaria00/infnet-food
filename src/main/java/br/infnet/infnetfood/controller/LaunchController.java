package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.refeicao.almoco.Almoco;
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
@RequestMapping("/food/v1/launch")
public class LaunchController {

    public static Map<String, Almoco> map = new HashMap<>();

    public static void addLaunch(final Almoco almoco, final String message) {
        map.put(almoco.getUuid(), almoco);
        AppImpressao.relatorio(message, almoco);
    }

    public static Collection<Almoco> getList() {
        return map.values();
    }

    private static void removeLaunch(final String uuid) {
        map.remove(uuid);
        System.out.printf("Deleted uuid: %s%n", uuid);
    }

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("listagem", getList());
        return "almoco/lista";
    }

    @GetMapping("/{uuid}/delete")
    public String delete(@PathVariable final String uuid) {
        removeLaunch(uuid);
        return "redirect:/food/v1/launch/";
    }
}
