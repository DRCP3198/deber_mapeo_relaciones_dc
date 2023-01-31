package com.example.demo.manytomany.service;

import com.example.demo.manytomany.modelo.Cliente;
import com.example.demo.manytomany.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void agregar(Vehiculo vehiculo);
	public void modificar(Vehiculo vehiculo);
	public Vehiculo encontrar(Integer id);
	public void eliminar(Integer id);

}
