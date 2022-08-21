package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.restaurante.Restaurante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/food/v1/restaurant")
public class RestaurantController {

    public static Map<String, Restaurante> map = new HashMap<>();

    public static void addRestaurant(final Restaurante restaurante) {
        map.put(restaurante.getUuid(), restaurante);
        restaurante.impressao();
    }

    public static Collection<Restaurante> getList() {
        return map.values();
    }

    private static void removeRestaurant(final String uuid) {
        map.remove(uuid);
        System.out.printf("Deleted uuid: %s%n", uuid);
    }

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("listagem", getList());
        return "restaurante/lista";
    }

    @GetMapping("/{uuid}/delete")
    public String delete(@PathVariable final String uuid) {
        removeRestaurant(uuid);
        return "redirect:/food/v1/restaurant/";
    }
}
