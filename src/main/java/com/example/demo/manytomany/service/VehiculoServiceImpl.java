package com.example.demo.manytomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.manytomany.modelo.Cliente;
import com.example.demo.manytomany.modelo.Vehiculo;
import com.example.demo.manytomany.repo.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo clienteRepo;

	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertar(vehiculo);
	}

	@Override
	public void modificar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizar(vehiculo);
	}

	@Override
	public Vehiculo encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.borrar(id);
	}


}
