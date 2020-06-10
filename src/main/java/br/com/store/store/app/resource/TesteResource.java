package br.com.store.store.app.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.store.store.app.service.TesteService;

@RestController
@RequestMapping("/teste")
public class TesteResource {

	@Autowired
	private TesteService testeService;

	@GetMapping("/listar")
	public ResponseEntity get() {		
		return new ResponseEntity(this.testeService.consulta(), HttpStatus.OK);
	}
}
