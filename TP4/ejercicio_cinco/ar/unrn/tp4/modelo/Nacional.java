package ar.unrn.tp4.modelo;

public class Nacional extends Remera {

	public Nacional(double precioRemera) {
		super(precioRemera);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularPrecioDeComercio(double monto) {
		// TODO Auto-generated method stub

		return monto + (monto * ADICIONAL_COMERCIO_NACIONAL);
	}

	@Override
	protected double calculoDeMontosAdicionales(double monto) {
		// TODO Auto-generated method stub

		double montoTotal = 0;

		montoTotal = (monto * COSTO_TRANSPORTE_NACIONAL) - (monto * BONIFICACION_NACIONAL);

		return montoTotal + monto;
	}

}
