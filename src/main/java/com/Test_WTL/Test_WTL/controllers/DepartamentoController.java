package com.Test_WTL.Test_WTL.controllers;

import com.Test_WTL.Test_WTL.domain.DepartamentoEntity;
import com.Test_WTL.Test_WTL.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService service;

    @GetMapping("/cadastrar")
    public String cadastrar(Model model) {
        model.addAttribute("departamento", new DepartamentoEntity());
        return "departamento/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap model){
        model.addAttribute("departamentos", service.buscarTodos());
        return "departamento/lista";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("departamento") DepartamentoEntity departamento) {
        service.salvar(departamento);
        return "redirect:/departamentos/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap model){
        model.addAttribute("departamento", service.buscarPorId(id));
        return "departamento/cadastro";
    }

    @PostMapping("/editar")
    public String editar(DepartamentoEntity departamento){
        service.editar(departamento);
        return "redirect:/departamentos/cadastrar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, ModelMap model){
        if (!service.departamentoTemCargos(id)){
            service.excluir(id);
        }
        return listar(model);
    }

}
