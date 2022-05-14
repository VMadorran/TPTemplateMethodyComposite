package ar.unrn.tp4.test;

import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.tp4.modelo.CalculadorJubilado;
import ar.unrn.tp4.modelo.CalculadorNoJubilado;
import ar.unrn.tp4.modelo.Log;

public class CalculadorTest {

	@Test
	public void calculadorJubilado() {
		var log = new Log();
		var calculador = new CalculadorJubilado(now().getMonth().getValue() - 1, log);
		double resultado = calculador.calcularPrecio(100);
		assertEquals(121d, resultado, 0.01f);
	}

	@Test
	public void calculadorJubiladoConPromocion() {

		var log = new Log();
		var calculador = new CalculadorJubilado(now().getMonth().getValue(), log);
		double resultado = calculador.calcularPrecio(100);
		assertEquals(115, resultado, 0.01f);

	}

	@Test
	public void calculadorNoJubiladoConPromocion() {

		var log = new Log();
		var calculador = new CalculadorNoJubilado(now().getMonth().getValue(), log);
		double resultado = calculador.calcularPrecio(100);
		assertEquals(100d, resultado, 0.01f);
	}

	@Test
	public void calculadorNoJubilado() {

		var log = new Log();
		var calculador = new CalculadorNoJubilado(now().getMonth().getValue() - 1, log);
		double resultado = calculador.calcularPrecio(100);
		assertEquals(110d, resultado, 0.01f);

	}
}
