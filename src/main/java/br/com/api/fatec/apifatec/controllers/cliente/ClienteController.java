package br.com.api.fatec.apifatec.controllers.cliente;
import br.com.api.fatec.apifatec.domain.cliente.ClienteService;
//import br.com.api.fatec.apifatec.domain.cliente.ClienteMapper;
//import br.com.api.fatec.apifatec.domain.cliente.ClienteDTO;
import br.com.api.fatec.apifatec.entities.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public ResponseEntity<List<Cliente>> listarClientes() {
		List<Cliente> clientes = clienteService.listarClientes();
		return new ResponseEntity<>(clientes, HttpStatus.OK);
	}

}
