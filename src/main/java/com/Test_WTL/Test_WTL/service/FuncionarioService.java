package com.Test_WTL.Test_WTL.service;

import java.util.List;

import com.Test_WTL.Test_WTL.entidades.FuncionarioEntity;

public interface FuncionarioService {

    void salvar(FuncionarioEntity funcionario);

    void editar(FuncionarioEntity funcionario);

    void excluir(Long id);

    FuncionarioEntity buscarPorId(Long id);

    List<FuncionarioEntity> buscarTodos();
}
