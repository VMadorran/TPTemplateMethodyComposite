package ar.unrn.tp4.modelo;

public class Seguro implements Servicio {

	private double costo;

	public Seguro(double costo) {
		this.costo = costo;
	}

	@Override
	public void agregarServicio(Servicio servicio) {
		// TODO Auto-generated method stub
	}

	@Override
	public double montoTotal() {
		// TODO Auto-generated method stub
		return this.costo;
	}

}
