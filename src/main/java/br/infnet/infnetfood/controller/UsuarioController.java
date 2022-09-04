package br.infnet.infnetfood.controller;

import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/food/v1/user")
public class UsuarioController {

    public static Map<String, Usuario> map = new HashMap<>();

    public static void create(final Usuario usuario) {
        map.put(usuario.getEmail(), usuario);
        usuario.impressao();
    }

    public static Collection<Usuario> getList() {
        return map.values();
    }

    private static void remove(final String uuid) {
        map.remove(uuid);
        System.out.printf("Deleted uuid: %s%n", uuid);
    }

    @GetMapping
    public String index(final Model model) {
        model.addAttribute("listagem", getList());
        return "usuario/lista";
    }

    @GetMapping(value = "/signup")
    public String signUp() {
        return "usuario/cadastro";
    }

    @PostMapping
    public String create(
            final Model model,
            @RequestParam final String name,
            @RequestParam final String email,
            @RequestParam final String senha) {
        Usuario usuario = new Usuario();
        usuario.setUuid(UUID.randomUUID().toString());
        usuario.setNome(name);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        create(usuario);
        model.addAttribute("user", usuario.getNome());
        return index(model);
    }

    @GetMapping("/{uuid}/delete")
    public String delete(@PathVariable final String uuid) {
        remove(uuid);
        return "redirect:/food/v1/user/";
    }
}
