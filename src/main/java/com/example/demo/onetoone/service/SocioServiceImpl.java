package com.example.demo.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.onetoone.modelo.Socio;
import com.example.demo.onetoone.repo.ISocioRepo;

@Service
public class SocioServiceImpl implements ISocioService{

	@Autowired
	private ISocioRepo iSocioRepo;
	
	
	@Override
	public void agregar(Socio socio) {
		// TODO Auto-generated method stub
		this.iSocioRepo.insertar(socio);
	}

	@Override
	public void modificar(Socio socio) {
		// TODO Auto-generated method stub
		this.iSocioRepo.actualizar(socio);
	}

	@Override
	public Socio encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iSocioRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iSocioRepo.borrar(id);
	}

}
