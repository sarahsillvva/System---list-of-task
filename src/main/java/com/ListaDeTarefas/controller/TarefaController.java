package com.ListaDeTarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ListaDeTarefas.dto.TarefaDTO;
import com.ListaDeTarefas.model.Tarefa;
import com.ListaDeTarefas.service.TarefaService;

@RequestMapping("/tarefa")
@RestController
public class TarefaController {

	@Autowired
	TarefaService tarefaService;
	
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	public List<TarefaDTO> listarTarefas(){
			return tarefaService.listarTarefas();
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public TarefaDTO cadastrarTarefa(@RequestBody TarefaDTO tarefaDTO){
			return tarefaService.cadastrarTarefa(tarefaDTO);
	}
	
	
	@PutMapping
	@ResponseStatus(value = HttpStatus.OK)
	public TarefaDTO atualizarTarefa(@RequestBody TarefaDTO tarefaDTO){
			return tarefaService.atualizarTarefa(tarefaDTO);
	}
	
	@DeleteMapping
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deletarTarefa(@RequestParam(name="tarefa_id")Long tarefaId){
			tarefaService.deletarTarefa(tarefaId);
	}
}
