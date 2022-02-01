package ec.edu.ups.pw59.evaWiliamChablaSRV.beans;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.pw59.evaWiliamChablaSRV.bussines.VehiculoONLocal;
import ec.edu.ups.pw59.evaWiliamChablaSRV.modelo.Vehiculo;

@WebService
public class ContactosServiceSOAP {
	
	@Inject
	private VehiculoONLocal vehiculoON;
	
	@WebMethod
	public String crearContacto(Vehiculo contacto) {
		
		try {
			vehiculoON.guardar(contacto);
			return "OK";
		} catch (Exception e) {
			return "Error";
		}
	}
	
	@WebMethod
	public List<Vehiculo> getContactos(){
		
		return vehiculoON.getVehiculos();
		
	}


}
