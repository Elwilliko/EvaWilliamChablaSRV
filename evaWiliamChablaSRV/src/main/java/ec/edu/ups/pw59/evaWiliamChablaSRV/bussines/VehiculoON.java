package ec.edu.ups.pw59.evaWiliamChablaSRV.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw59.evaWiliamChablaSRV.dao.VehiculoDao;
import ec.edu.ups.pw59.evaWiliamChablaSRV.modelo.Vehiculo;


@Stateless
public class VehiculoON implements VehiculoONRemote, VehiculoONLocal {
	
	@Inject
	private VehiculoDao daoVehiculo;
	
	public void insert(Vehiculo p) throws Exception{
		daoVehiculo.insert(p);
	}
	
	public void guardar(Vehiculo p) throws Exception{
		if(daoVehiculo.read(p.getPlaca())==null)
			daoVehiculo.insert(p);
		else
			daoVehiculo.update(p);
	}
	
	public List<Vehiculo> getVehiculos(){
		return daoVehiculo.getList();
	}

	public Vehiculo getVehiculo(String placa) {
		return daoVehiculo.read(placa);
	}



}
