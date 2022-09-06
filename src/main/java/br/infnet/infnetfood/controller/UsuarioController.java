package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import br.infnet.infnetfood.domain.service.usuario.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/food/v1/user")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(final UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public String getAll(final Model model) {
        model.addAttribute("listagem", usuarioService.getAll());
        return "usuario/lista";
    }

    @GetMapping(value = "/signup")
    public String signUp() {
        return "usuario/cadastro";
    }

    @PostMapping
    public String create(
            @RequestParam final String name,
            @RequestParam final String email,
            @RequestParam final String senha) {
        Usuario usuario = new Usuario();
        usuario.setNome(name);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuarioService.create(usuario);
        return "redirect:/food/v1/authentication";
    }

    @GetMapping("/{email}/delete")
    public String remove(@PathVariable final String email) {
        usuarioService.remove(email);
        return "redirect:/food/v1/user/";
    }
}
