package com.ListaDeTarefas.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ListaDeTarefas.dto.TarefaDTO;
import com.ListaDeTarefas.model.Tarefa;
import com.ListaDeTarefas.repository.TarefaRepository;
import com.ListaDeTarefas.service.TarefaService;
@Component
public class TarefaServiceImpl implements TarefaService {
	
	@Autowired
	TarefaRepository tarefaRepository;

	public List<TarefaDTO> listarTarefas() {
		return tarefaRepository.findAll()
				.stream()
				.map(p-> new TarefaDTO(p))
				.collect(Collectors.toList());
	}
	
	public TarefaDTO cadastrarTarefa(TarefaDTO tarefaDTO){
		return new TarefaDTO (tarefaRepository.save(new Tarefa(tarefaDTO)));
	}
	
	public TarefaDTO atualizarTarefa(TarefaDTO tarefaDTO){
		Optional<Tarefa> tarefa = tarefaRepository.findById(tarefaDTO.getId());
		
			if(tarefa.isPresent()) {
				tarefa.orElse(tarefaRepository.save(new Tarefa (tarefaDTO)));
			}
			return new TarefaDTO (tarefa.get());
	}
		
	public void deletarTarefa(Long tarefaId){
		tarefaRepository.deleteById(tarefaId);;
	}
	
}
