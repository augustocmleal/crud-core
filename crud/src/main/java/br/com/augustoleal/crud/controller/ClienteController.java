package br.com.augustoleal.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.augustoleal.crud.model.Cliente;
import br.com.augustoleal.crud.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository repository;
	
	@PostMapping("/insertClient")
    public void insertClient(@RequestBody Cliente cliente) {
        repository.insertCliente(cliente);
    }
	
	@RequestMapping("/getClients")
    public List<Cliente> getClients() {
        return repository.getClientes();
    }
}
