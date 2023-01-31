package com.example.demo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.manytomany.modelo.Cliente;
import com.example.demo.manytomany.modelo.Vehiculo;
import com.example.demo.manytomany.service.IVehiculoService;

@SpringBootApplication
public class DeberMapeoRelacionesDcManytomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DeberMapeoRelacionesDcManytomanyApplication.class, args);
	}

	@Autowired 
	private IVehiculoService iVehiculoService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Set<Vehiculo> vehi = new HashSet<>();
		Set<Cliente>cli = new HashSet<>();
		//*****************************
		//*****CLIENTES****************
		/*Cliente cliente = new Cliente();
		cliente.setNombre("Amely");
		cliente.setApellido("Coloma");
		cliente.setCedula("1751457191");
		cliente.setNumTarjeta("1001212");
		cli.add(cliente);
		cliente.setVehiculos(vehi);*/
		
		/*Cliente cliente1 = new Cliente();
		cliente1.setNombre("Dillan");
		cliente1.setApellido("Coloma");
		cliente1.setCedula("1751457167");
		cliente1.setNumTarjeta("1001010");
		cli.add(cliente1);
		cliente1.setVehiculos(vehi);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Israel");
		cliente2.setApellido("Coloma");
		cliente2.setCedula("1751457185");
		cliente2.setNumTarjeta("100100");
		cli.add(cliente2);
		cliente2.setVehiculos(vehi);*/
		
		Cliente cliente3 = new Cliente();
		cliente3.setNombre("Mariela");
		cliente3.setApellido("Pozo");
		cliente3.setCedula("1751457112");
		cliente3.setNumTarjeta("111111");
		cli.add(cliente3);
		cliente3.setVehiculos(vehi);
		
		Cliente cliente4 = new Cliente();
		cliente4.setNombre("Jose");
		cliente4.setApellido("Coloma");
		cliente4.setCedula("1751457110");
		cliente4.setNumTarjeta("122222");
		cli.add(cliente4);
		cliente4.setVehiculos(vehi);
		

		Cliente cliente5 = new Cliente();
		cliente5.setNombre("Francisco");
		cliente5.setApellido("Pozo");
		cliente5.setCedula("1751457100");
		cliente5.setNumTarjeta("133333");
		cli.add(cliente5);
		cliente5.setVehiculos(vehi);
		

		Cliente cliente6 = new Cliente();
		cliente6.setNombre("Patricia");
		cliente6.setApellido("Pozo");
		cliente6.setCedula("1751457000");
		cliente6.setNumTarjeta("144444");
		cli.add(cliente6);
		cliente6.setVehiculos(vehi);
	
	
		
		//******************************************
		//****************VEHICULOS****************
		/*Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Mercedes Benz");
		vehiculo.setModelo("AMG GT 63");
		vehiculo.setValor(new BigDecimal(120000));
		vehiculo.setTipo("coupe");
		vehi.add(vehiculo);
		vehiculo.setClientes(cli);*/
		
		/*Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setMarca("lamborghini");
		vehiculo1.setModelo("aventador");
		vehiculo1.setValor(new BigDecimal(507000));
		vehiculo1.setTipo("superdeportivo");
		vehi.add(vehiculo1);
		vehiculo1.setClientes(cli);*/
		
		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setMarca("Ferrari");
		vehiculo2.setModelo("458 Italia");
		vehiculo2.setValor(new BigDecimal(167000));
		vehiculo2.setTipo("superdeportivo");
		vehi.add(vehiculo2);
		vehiculo2.setClientes(cli);
		
		Vehiculo vehiculo3 = new Vehiculo();
		vehiculo3.setMarca("Kia");
		vehiculo3.setModelo("stinger");
		vehiculo3.setValor(new BigDecimal(37000));
		vehiculo3.setTipo("deportivo");
		vehi.add(vehiculo3);
		vehiculo3.setClientes(cli);
		
		Vehiculo vehiculo4 = new Vehiculo();
		vehiculo4.setMarca("BMW");
		vehiculo4.setModelo("M3");
		vehiculo4.setValor(new BigDecimal(50000));
		vehiculo4.setTipo("superdeportivo");
		vehi.add(vehiculo4);
		vehiculo4.setClientes(cli);
		
//********************************************
		Vehiculo vehiculo5 = new Vehiculo();
		vehiculo5.setMarca("Mazda");
		vehiculo5.setModelo("M5");
		vehiculo5.setValor(new BigDecimal(34000));
		vehiculo5.setTipo("superdeportivo");
		vehi.add(vehiculo5);
		vehiculo5.setClientes(cli);
		
		Vehiculo vehiculo6 = new Vehiculo();
		vehiculo6.setMarca("Nissan");
		vehiculo6.setModelo("Skyline GTR 32 ");
		vehiculo6.setValor(new BigDecimal(380000));
		vehiculo6.setTipo("superdeportivo");
		vehi.add(vehiculo6);
		vehiculo6.setClientes(cli);

		Vehiculo vehiculo7 = new Vehiculo();
		vehiculo7.setMarca("Nissan");
		vehiculo7.setModelo("370z ");
		vehiculo7.setValor(new BigDecimal(53000));
		vehiculo7.setTipo("superdeportivo");
		vehi.add(vehiculo7);
		vehiculo7.setClientes(cli);
		
		Vehiculo vehiculo8 = new Vehiculo();
		vehiculo8.setMarca("Ferrari");
		vehiculo8.setModelo("F40 ");
		vehiculo8.setValor(new BigDecimal(2237345));
		vehiculo8.setTipo("superdeportivo");
		vehi.add(vehiculo8);
		vehiculo8.setClientes(cli);
		
		/*Vehiculo vh =this.iVehiculoService.encontrar(2);
		vh.setClientes(cli);*/
		this.iVehiculoService.agregar(vehiculo8);

		
		
		
		
	}

}
