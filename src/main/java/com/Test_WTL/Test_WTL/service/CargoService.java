package com.Test_WTL.Test_WTL.service;

import com.Test_WTL.Test_WTL.domain.CargoEntity;

import java.util.List;


public interface CargoService {

	void salvar(CargoEntity cargo);
	
	void editar(CargoEntity cargo);
	
	void excluir(Long id);
	
	CargoEntity buscarPorId(Long id);
	
	List<CargoEntity> buscarTodos();

}
