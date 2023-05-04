package com.claudiorosa.appanimals.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_gato")
public class GatoEntity {

	@Id
	@Column(name = "id_gato")
	private Integer id;

	@Column(name = "nome_gato")
	private String nome;
	
	@Column(name = "raca_gato")
	private String raca;
	
	@Column(name = "idade_gato")
	private Integer idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome; // CRUD
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public GatoEntity(String nome, String raca, Integer idade) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}

	public String comer() {
		return "Come gatinho, come";
	}

	public String reinar() {
		return "Saaaaaiiii daaaiiiii";
	}

	public String beber() {
		return "Toma agua gatinho";
	}

	public void miar() {
		System.out.println("MEEEEEAAAAWWWW");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
