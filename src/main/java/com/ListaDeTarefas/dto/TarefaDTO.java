package com.ListaDeTarefas.dto;

import java.sql.Date;

import com.ListaDeTarefas.model.Tarefa;


public class TarefaDTO {

	private Long id;
	
	private String nome;
	
	private Double custo;
	
	private Date dtLimite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public Date getDtLimite() {
		return dtLimite;
	}

	public void setDtLimite(Date dtLimite) {
		this.dtLimite = dtLimite;
	}

	public TarefaDTO() {
		super();
	}
	
	public TarefaDTO( Tarefa tarefa) {
		this.id = tarefa.getId();
		this.nome = tarefa.getNome();
		this.custo = tarefa.getCusto();
		this.dtLimite = tarefa.getDtLimite();
	}
	
	

}
