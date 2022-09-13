package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.restaurante.Restaurante;
import br.infnet.infnetfood.domain.service.restaurant.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/food/v1/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(final RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping(value = "/register")
    public String signUp() {
        return "restaurante/cadastro";
    }

    @PostMapping
    public String create(final Restaurante restaurante) {
        restaurantService.create(restaurante);
        return "redirect:restaurant/";
    }

    @GetMapping("/")
    public String getAll(final Model model) {
        model.addAttribute("listagem", restaurantService.getAll());
        return "restaurante/lista";
    }

    @GetMapping("/{uuid}/delete")
    public String remove(@PathVariable final String uuid) {
        restaurantService.remove(uuid);
        return "redirect:/food/v1/restaurant/";
    }
}
