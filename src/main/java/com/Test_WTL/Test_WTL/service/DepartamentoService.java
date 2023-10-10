package com.Test_WTL.Test_WTL.service;

import java.util.List;

import com.Test_WTL.Test_WTL.entidades.DepartamentoEntity;

public interface DepartamentoService {

    void salvar(DepartamentoEntity departamento);

    void editar(DepartamentoEntity departamento);

    void excluir(Long id);

    DepartamentoEntity buscarPorId(Long id);
    
    List<DepartamentoEntity> buscarTodos();
}
