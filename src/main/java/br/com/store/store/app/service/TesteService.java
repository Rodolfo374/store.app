package br.com.store.store.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.store.store.app.entity.Teste;
import br.com.store.store.app.repository.TesteRepository;

@Service
public class TesteService {

	@Autowired
	private TesteRepository rep;

	public List<Teste> consulta() {
		return this.rep.findAll();
	}
}
