package com.example.demo.onetoone.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.onetoone.modelo.Socio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class SocioRepoImpl implements ISocioRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Socio socio) {
		// TODO Auto-generated method stub
		this.entityManager.persist(socio);
	}

	@Override
	public void actualizar(Socio socio) {
		// TODO Auto-generated method stub
		this.entityManager.merge(socio);
	}

	@Override
	public Socio buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Socio.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Socio socio = this.buscar(id);
		this.entityManager.remove(socio);
	}

}
