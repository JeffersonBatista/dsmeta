package com.devsuperior.dsmeta.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

//Componente responsável por acessar o Banco de Dados
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
