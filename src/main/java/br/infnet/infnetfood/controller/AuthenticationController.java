package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import br.infnet.infnetfood.domain.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SessionAttributes("user")
@Controller
@RequestMapping(value = "/food/v1/authentication")
public class AuthenticationController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public String login() {
        return "authentication/login";
    }

    @PostMapping
    public String authentication(final Model model, @RequestParam final String email, @RequestParam final String senha) {
        validateAuthentication(email, senha);
        final Usuario usuario = usuarioService.getByEmail(email);
        if (usuario == null) {
            model.addAttribute("userNotFound", email);
            return "authentication/login";
        }

        model.addAttribute("user", usuario);
        return "home";
    }

    @GetMapping(value = "/logout")
    public String logout(final Model model) {
        model.addAttribute("user", "");
        return "authentication/login";
    }

    private void validateAuthentication(final String email, final String senha) {
        if (email.equalsIgnoreCase(senha)) {
            throw new RuntimeException("A senha não pode conter o email");
        }
    }
}
