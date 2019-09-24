package com.philipe.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philipe.cursomc.domain.Cidade;
import com.philipe.cursomc.respositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;
	
	
	public List<Cidade> findByEstado(Integer estadoId){
		
		return repo.findCidades(estadoId);
	}
	
}
