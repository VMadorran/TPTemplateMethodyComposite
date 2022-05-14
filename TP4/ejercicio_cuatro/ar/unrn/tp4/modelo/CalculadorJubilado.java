package ar.unrn.tp4.modelo;

public class CalculadorJubilado extends Calculador {

	public CalculadorJubilado(int mesEnPromocion, LogTransaction log) {
		super(mesEnPromocion, log);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double precioSinPromocion(double precioProducto) {
		// TODO Auto-generated method stub
		return precioProducto * ADICIONAL_JUBILADO;
	}

	@Override
	protected double precioConPromocion(double precioProducto) {
		// TODO Auto-generated method stub
		return precioProducto * PROMOCION_JUBILADO;
	}

}
