package ec.edu.ups.pw59.evaWiliamChablaSRV.bussines;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.pw59.evaWiliamChablaSRV.modelo.Vehiculo;


@Remote
public interface VehiculoONRemote {
	
	public void insert(Vehiculo p) throws Exception;
	public void guardar(Vehiculo p) throws Exception;
	public List<Vehiculo> getVehiculos();
	public Vehiculo getVehiculo(String placa);

}
