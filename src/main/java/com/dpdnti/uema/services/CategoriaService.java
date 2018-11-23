package com.dpdnti.uema.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dpdnti.uema.domain.Categoria;
import com.dpdnti.uema.repositories.CategoriaRepository;
import com.dpdnti.uema.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException (
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
		}
}
