package com.Test_WTL.Test_WTL.service;

import java.util.List;

import com.Test_WTL.Test_WTL.dao.CargoDao;
import com.Test_WTL.Test_WTL.domain.CargoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service @Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {
	
	@Autowired
	private CargoDao dao;

	@Override
	public void salvar(CargoEntity cargo) {
		dao.save(cargo);		
	}

	@Override
	public void editar(CargoEntity cargo) {
		dao.update(cargo);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public CargoEntity buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<CargoEntity> buscarTodos() {
		
		return dao.findAll();
	}


}
