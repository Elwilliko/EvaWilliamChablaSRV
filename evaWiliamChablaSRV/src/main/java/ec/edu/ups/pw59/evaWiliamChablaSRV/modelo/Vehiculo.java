package ec.edu.ups.pw59.evaWiliamChablaSRV.modelo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Vehiculo {
	
	@Id
	@Column(name= "vei_placa")
	private String placa;
	
	@Column(name= "vei_nombre")
	private String nombre;
	
	@Column(name= "vei_modelo")
	private String modelo;
	
	@Column(name= "vei_color")
	private String color;
	

}
