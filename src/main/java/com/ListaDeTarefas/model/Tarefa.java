package com.ListaDeTarefas.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ListaDeTarefas.dto.TarefaDTO;
import com.sun.istack.NotNull;

@Entity(name="Tarefas")
public class Tarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome_tarefa")
	@NotNull
	private String nome;
	
	@Column (name="custo")
	private Double custo;
	
	@Column (name="dt_limite")
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

	public Tarefa() {
		super();
	}
	
	public Tarefa( TarefaDTO tarefadto) {
		this.id = tarefadto.getId();
		this.nome = tarefadto.getNome();
		this.custo = tarefadto.getCusto();
		this.dtLimite = tarefadto.getDtLimite();
	}
	
	
}
