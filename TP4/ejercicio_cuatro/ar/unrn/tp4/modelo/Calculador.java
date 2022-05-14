package ar.unrn.tp4.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

	public static final double ADICIONAL_NO_JUBILADO = 0.1;
	public static final double PROMOCION_JUBILADO = 0.15;
	public static final double ADICIONAL_JUBILADO = 0.21;
	private int mesEnPromocion;
	private LogTransaction log;

	public Calculador(int mesEnPromocion, LogTransaction log) {
		this.mesEnPromocion = mesEnPromocion;
		this.log = log;
	}

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (of(mesEnPromocion).equals(now().getMonth())) {
			precioTotal = precioConPromocion(precioProducto) + precioProducto;
		} else {
			precioTotal = precioSinPromocion(precioProducto) + precioProducto;
		}
		log.log(CalculadorNoJubilado.class.getName());
		return precioTotal;
	}

	protected abstract double precioSinPromocion(double precioProducto);

	protected abstract double precioConPromocion(double precioProducto);

}
