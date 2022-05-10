package com.ListaDeTarefas.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.ListaDeTarefas.dto.TarefaDTO;

@Service
public interface TarefaService {

	public List<TarefaDTO>listarTarefas();
	public TarefaDTO cadastrarTarefa(TarefaDTO tarefaDTO);
	public TarefaDTO atualizarTarefa(TarefaDTO tarefaDTO);
	public void deletarTarefa(Long tarefaId);

}

