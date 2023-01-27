package com.example.demo.onetoone.service;

import com.example.demo.onetoone.modelo.Socio;

public interface ISocioService {
	
	public void agregar(Socio socio);
	public void modificar(Socio socio);
	public Socio encontrar(Integer id);
	public void eliminar(Integer id);

}
