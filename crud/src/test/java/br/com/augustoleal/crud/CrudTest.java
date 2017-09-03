package br.com.augustoleal.crud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.augustoleal.crud.model.Cliente;
import br.com.augustoleal.crud.repository.ClienteRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationcontext.xml")
public class CrudTest {
	
	private static final Logger log = LoggerFactory.getLogger(CrudTest.class);

	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private Cliente cliente;
	
	@Test
	public void crudTest(){
 		cliente.nome = "João da Silva";
 		
		repository.insertCliente(cliente);
		
		log.debug("clientes found with findAll():");
		log.debug("-------------------------------");
		for (Cliente c : repository.getClientes()) {
			log.debug(c.toString());
		}
		log.info("");
	}
}
