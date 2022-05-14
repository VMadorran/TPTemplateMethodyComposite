package ar.unrn.tp4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.tp4.modelo.Importada;
import ar.unrn.tp4.modelo.Nacional;

public class RemeraTest {

	@Test
	public void remeraImportada() {

		var remera = new Importada(100);

		double resultadoEsperado = remera.calcularPrecio();

		assertEquals(135, resultadoEsperado);
	}

	@Test
	public void remeraNacional() {

		var remera = new Nacional(100);

		double resultadoEsperado = remera.calcularPrecio();

		assertEquals(93.7d, resultadoEsperado, 0.1f);

	}
}
