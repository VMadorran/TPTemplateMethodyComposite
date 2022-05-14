package ar.unrn.tp4.modelo;

public class Importada extends Remera {

	public Importada(double precioRemera) {
		super(precioRemera);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularPrecioDeComercio(double monto) {
		// TODO Auto-generated method stub

		return monto + (monto * ADICIONAL_COMERCIO_IMPORTADA);
	}

	@Override
	protected double calculoDeMontosAdicionales(double monto) {
		// TODO Auto-generated method stub

		double montoTotal = 0;

		montoTotal = (monto * REGARGO_IMPORTADA) + (monto * IMPUESTO_ADUANERO_IMPORTADA);

		return montoTotal + monto;
	}

}
