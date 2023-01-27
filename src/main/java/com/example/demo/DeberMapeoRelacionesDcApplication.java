package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.onetoone.modelo.Socio;
import com.example.demo.onetoone.modelo.Tarjeta;
import com.example.demo.onetoone.service.ISocioService;

@SpringBootApplication
public class DeberMapeoRelacionesDcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DeberMapeoRelacionesDcApplication.class, args);
	}

	@Autowired 
	private ISocioService iSocioService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Socio socio = new Socio();
		socio.setNombre("Renato");
		socio.setApellido("Coloma Pozo");
		socio.setCedula("1751457167");
		socio.setTelefono("0963471341");
		socio.setDireccion("Tumbaco-Esperanza,psj flor de tilo");
		
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setNumero("2025658");
		tarjeta.setEmision(LocalDateTime.now());
		tarjeta.setCaducidad(LocalDateTime.of(2027, 8, 31,19,12));
		socio.setTarjeta(tarjeta);
		this.iSocioService.agregar(socio);
		this.iSocioService.eliminar(2);
		System.out.println(this.iSocioService.encontrar(3));
		
		Socio socioMod =this.iSocioService.encontrar(3);
		socioMod.setNombre("Alberto");
		this.iSocioService.modificar(socioMod);
		
		
	}

}
