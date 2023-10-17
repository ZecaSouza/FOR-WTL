package com.Test_WTL.Test_WTL.controllers;

import com.Test_WTL.Test_WTL.domain.CargoEntity;
import com.Test_WTL.Test_WTL.domain.DepartamentoEntity;
import com.Test_WTL.Test_WTL.service.CargoService;
import com.Test_WTL.Test_WTL.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String salvar(CargoEntity cargo, RedirectAttributes attr) {
        cargoService.salvar(cargo);
        attr.addFlashAttribute("success", "Cargo inserido com sucesso.");
        return "redirect:/cargos/cadastrar";
    }

    @ModelAttribute("departamentos")
    public List<DepartamentoEntity> listaDeDepartamentos() {
        return departamentoService.buscarTodos();
    }
}
