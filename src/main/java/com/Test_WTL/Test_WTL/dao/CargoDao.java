package com.Test_WTL.Test_WTL.dao;

import java.util.List;

import com.Test_WTL.Test_WTL.entidades.CargoEntity;

public interface CargoDao {

    void save(CargoEntity cargo );

    void update(CargoEntity cargo);

    void delete(Long id);

    CargoEntity findById(Long id);

    List<CargoEntity> findAll();
}
