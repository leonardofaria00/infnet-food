package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.restaurante.Restaurante;
import br.infnet.infnetfood.domain.service.restaurant.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/food/v1/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(final RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    public void addRestaurant(final Restaurante restaurante) {
        restaurantService.addRestaurant(restaurante);
    }

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("listagem", restaurantService.getRestaurant());
        return "restaurante/lista";
    }

    @GetMapping("/{uuid}/delete")
    public String delete(@PathVariable final String uuid) {
        restaurantService.removeRestaurant(uuid);
        return "redirect:/food/v1/restaurant/";
    }
}
