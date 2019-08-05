package com.supermarket.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supermarket.online.domain.SuperMercado;

@Repository
public interface SuperMercadoRepository extends JpaRepository<SuperMercado, Integer>  {

}
