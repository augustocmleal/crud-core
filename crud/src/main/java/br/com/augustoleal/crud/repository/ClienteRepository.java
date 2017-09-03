package br.com.augustoleal.crud.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.augustoleal.crud.model.Cliente;

@Repository
public class ClienteRepository extends AbstractRepository{
	
	public void insertCliente(Cliente cliente){
		sqlSession.insert("mappers.core.cliente.ClienteMapper.insertCliente", cliente);
	}
	
	public List<Cliente> getClientes(){
		return sqlSession.selectList("mappers.core.cliente.ClienteMapper.getClientes");
	}
 
}
