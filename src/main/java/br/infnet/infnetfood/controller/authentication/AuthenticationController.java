package br.infnet.infnetfood.controller.authentication;

import br.infnet.infnetfood.controller.UsuarioController;
import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/food/v1/authentication")
public class AuthenticationController {

    @GetMapping
    public String login() {
        return "authentication/login";
    }

    @PostMapping
    public String authentication(final Model model, @RequestParam final String email, @RequestParam final String senha) {
        validateAuthentication(email, senha);
        for (Usuario usuario : UsuarioController.getList()) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                model.addAttribute("user", usuario.getNome());
                return "home";
            }
        }
        return "home";
    }

    @GetMapping(value = "/logout")
    public String logout(final Model model) {
        model.addAttribute("user", "");
        return "home";
    }

    private void validateAuthentication(final String email, final String senha) {
        if (email.equalsIgnoreCase(senha)) {
            throw new RuntimeException("A senha não pode conter o email");
        }
    }
}
