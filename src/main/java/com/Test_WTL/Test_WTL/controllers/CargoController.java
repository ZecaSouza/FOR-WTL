package com.Test_WTL.Test_WTL.controllers;

import com.Test_WTL.Test_WTL.domain.CargoEntity;
import com.Test_WTL.Test_WTL.domain.DepartamentoEntity;
import com.Test_WTL.Test_WTL.service.CargoService;
import com.Test_WTL.Test_WTL.service.DepartamentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoService cargoService;
    @Autowired
    private DepartamentoService departamentoService;

        @GetMapping("/cadastrar")
        public String cadastrar(Model model){
            model.addAttribute("cargo", new CargoEntity());
            return "cargo/cadastro";
        }

    @GetMapping("/listar")
    public String listar(ModelMap model){
            model.addAttribute("cargos", cargoService.buscarTodos());
        return "cargo/lista";
    }

    @PostMapping("/salvar")
    public String salvar(@Valid CargoEntity cargo, BindingResult result,  RedirectAttributes attr) {

        if (result.hasErrors()) {
            return "cargo/cadastro";
        }

        cargoService.salvar(cargo);
        attr.addFlashAttribute("success", "Cargo inserido com sucesso.");
        return "redirect:/cargos/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("cargo", cargoService.buscarPorId(id));
        return "cargo/cadastro";
    }

    @PostMapping("/editar")
    public String editar(@Valid CargoEntity cargo, BindingResult result,  RedirectAttributes attr) {

        if (result.hasErrors()) {
            return "cargo/cadastro";
        }

        cargoService.editar(cargo);
        attr.addFlashAttribute("success", "Registro atualizado com sucesso.");
        return "redirect:/cargos/cadastrar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
            cargoService.excluir(id);
            attr.addFlashAttribute("success", "Cargo excluido com sucesso.");
        return "redirect:/cargos/listar";
    }

    @ModelAttribute("departamentos")
    public List<DepartamentoEntity> listaDeDepartamentos() {
        return departamentoService.buscarTodos();
    }
}
