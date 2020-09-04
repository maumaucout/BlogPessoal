package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Essa classe é uma entidade do JPA.
@Table(name = "tb_postagem") // Essa entidade dentro do banco de dados será uma tabela e o nome será
								// postagem.
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // No banco de dados, este atributo vai ser a primarykey, chave
														// primária.
	private long id;

	@NotNull // Não pode retornar vazio.
	@Size(min = 5, max = 20) // Quantidade de caracteres.
	private String titulo;

	@NotNull // Não pode retornar vazio.
	@Size(min = 10, max = 100) // Quantidade de caracteres.
	private String texto;

	@Temporal(TemporalType.TIMESTAMP) // Indica que estamos trabalhando com tempo, definindo qual tipo de tempo.
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

}
