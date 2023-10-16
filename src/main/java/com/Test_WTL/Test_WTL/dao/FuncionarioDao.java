package com.Test_WTL.Test_WTL.dao;

import java.util.List;

import com.Test_WTL.Test_WTL.domain.FuncionarioEntity;

public interface FuncionarioDao {
    
	void save(FuncionarioEntity funcionario);

    void update(FuncionarioEntity funcionario);

    void delete(Long id);

    FuncionarioEntity findById(Long id);

    List<FuncionarioEntity> findAll();
}
