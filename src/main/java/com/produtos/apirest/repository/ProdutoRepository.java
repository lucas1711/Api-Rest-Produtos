package com.produtos.apirest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;


//interface que extende o jpaRepository, O jparepository ele ja possui varios metodos prontos para fazer persistencia no banco de dados
// metodos como save, delete, put, post, findall
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Optional<Produto> findById(Long id);

	
}
