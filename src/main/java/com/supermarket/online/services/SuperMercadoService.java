package com.supermarket.online.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.online.domain.SuperMercado;
import com.supermarket.online.repositories.SuperMercadoRepository;

@Service
public class SuperMercadoService {

	@Autowired
	private SuperMercadoRepository repositorio;

	public void salvar(SuperMercado superMercado) {
		superMercado.setId(null);
		repositorio.save(superMercado);
	}

}
