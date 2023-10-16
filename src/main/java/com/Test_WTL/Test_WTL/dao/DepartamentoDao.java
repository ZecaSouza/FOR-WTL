package com.Test_WTL.Test_WTL.dao;

import java.util.List;

import com.Test_WTL.Test_WTL.domain.DepartamentoEntity;

public interface DepartamentoDao {


    void save(DepartamentoEntity departamento);

    void update(DepartamentoEntity departamento);

    void delete(Long id);

    DepartamentoEntity findById(Long id);

    List<DepartamentoEntity> findAll();
}
