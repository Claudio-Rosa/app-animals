package com.claudiorosa.appanimals.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cachorro")
public class CachorroEntity {

	@Id
	@Column(name = "id_cachorro")
	private Integer id;

	@Column(name = "nome_cachorro")
	private String nome;

	@Column(name = "raca_cachorro")
	private String raca;

	@Column(name = "idade_cachorro")
	private Integer idade;

	@Column(name = "peso_cachorro")
	private Double peso;

	public CachorroEntity(Integer id, String nome, String raca, Integer idade, Double peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}

	public CachorroEntity() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String latir() {
		return "cachorro latiu";
	}

	public String comer() {
		return "cachorro comeu";
	}

	public String morder() {
		return "Ai cachorro me mordeu";
	}

	public String dormir() {
		return "Vai dormir";
	}

	public void mijar() {
		System.out.println("ixi fez xixi aqui");
	}

}

// MVC
// M => model - dado puro (cachorro- caracteristicas)
// V => view - parte de visualizar (o que apresenta pro usuario)
// C => controll - controle dos dados/ gerenciar/ administrador

// DAO
// D => data - representa os dados
// A => acess - acesso aos dados
// O => object - representacão gerenica  dos dados