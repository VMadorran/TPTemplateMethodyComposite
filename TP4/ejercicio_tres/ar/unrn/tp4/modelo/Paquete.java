package ar.unrn.tp4.modelo;

import java.util.ArrayList;
import java.util.List;

public class Paquete implements Servicio {

	private List<Servicio> seguros = new ArrayList<Servicio>();

	@Override
	public void agregarServicio(Servicio servicio) {
		// TODO Auto-generated method stub
		seguros.add(servicio);
	}

	@Override
	public double montoTotal() {
		// TODO Auto-generated method stub

		double montoTotal = 0;

		for (Servicio seguro : seguros) {
			montoTotal += seguro.montoTotal();
		}
		return montoTotal;
	}

}
