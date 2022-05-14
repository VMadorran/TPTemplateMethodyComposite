package ar.unrn.tp4.modelo;

public abstract class Remera {

	private double precioUnitario;
	public static final double REGARGO_IMPORTADA = 0.03;
	public static final double IMPUESTO_ADUANERO_IMPORTADA = 0.05;
	public static final double COSTO_TRANSPORTE_NACIONAL = 0.015;
	public static final double BONIFICACION_NACIONAL = 0.2;
	public static final double ADICIONAL_COMERCIO_IMPORTADA = 0.25;
	public static final double ADICIONAL_COMERCIO_NACIONAL = 0.15;

	public Remera(double precioRemera) {
		this.precioUnitario = precioRemera;
	}

	public double calcularPrecio() {

		double montoDeAdicionales = 0;

		montoDeAdicionales = this.calculoDeMontosAdicionales(precioUnitario);
		return this.calcularPrecioDeComercio(montoDeAdicionales);

	}

	protected abstract double calcularPrecioDeComercio(double monto);

	protected abstract double calculoDeMontosAdicionales(double monto);
}
