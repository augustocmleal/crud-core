package br.com.augustoleal.crud.model;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
	
	public Long id;
	public String nome;

	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
	
}
