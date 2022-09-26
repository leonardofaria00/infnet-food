package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.order.Order;
import br.infnet.infnetfood.domain.service.order.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/food/v1/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public String getAllOrders(final Model model){
        model.addAttribute("listagem", orderService.getAllOrders());
        return "order/lista";
    }

    @PostMapping
    public String createOrder(final Order order) {
        orderService.createOrder(order);
        return "redirect:/food/v1/order";
    }
}
