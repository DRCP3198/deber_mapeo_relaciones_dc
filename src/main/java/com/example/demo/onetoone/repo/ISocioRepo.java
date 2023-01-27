package com.example.demo.onetoone.repo;

import com.example.demo.onetoone.modelo.Socio;

public interface ISocioRepo {
	
	public void insertar(Socio socio);
	public void actualizar(Socio socio);
	public Socio buscar(Integer id);
	public void borrar(Integer id);

}
