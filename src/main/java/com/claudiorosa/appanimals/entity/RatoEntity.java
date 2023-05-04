package com.claudiorosa.appanimals.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_rato")
public class RatoEntity {
	
	
	 @Id
	 @Column(name = "id_rato")
	 private String id;
	 
	 @Column(name = "nome_rato")
	 private String nome;

	 @Column(name = "idade_rato")
	 private Integer idade;
	 
	 @Column(name = "raca_rato")
	 private String raca;
	 
	 public String getNome() {
	      return nome;
	 }

	 public void setNome(String nome) {
	      this.nome = nome;
	 }

	 public Integer getIdade() {
	      return idade;
	 }

	 public void setIdade(Integer idade) {
	     this.idade = idade;
	 }

	 public String getRaca() {
	     return raca;
	 }

	 public void setRaca(String raca) {
	     this.raca = raca;
	 }

	 public RatoEntity(String nome, Integer idade, String raca) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
	 }

	 public String roer(){
	     return "Puts roeu minha bermuda";
	 }

	 public String nadar(){
	     return "Olha ele está nadando";
	 }

	 public String comer(){
	      return "Comeu a racão do luke ";
	 }

	 public void morrer(){
	      System.out.println("morreu o ratinho");
	 }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	    
}
