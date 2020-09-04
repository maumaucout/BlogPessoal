package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo); //Busca todos pelo titulo, pelo nome do atributo da minha entidade, contem = like SQL, tudo que contém dentro da variavel, ignora maiusculo e minusculo.
}
