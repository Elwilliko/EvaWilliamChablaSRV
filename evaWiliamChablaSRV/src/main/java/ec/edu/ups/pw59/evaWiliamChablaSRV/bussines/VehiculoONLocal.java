package ec.edu.ups.pw59.evaWiliamChablaSRV.bussines;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.pw59.evaWiliamChablaSRV.modelo.Vehiculo;


@Local
public interface VehiculoONLocal {
	
	public void insert(Vehiculo p) throws Exception;
	public void guardar(Vehiculo p) throws Exception;
	public List<Vehiculo> getVehiculos();
	public Vehiculo getVehiculo(String placa);

}
