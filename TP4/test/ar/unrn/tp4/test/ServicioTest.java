package ar.unrn.tp4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.tp4.modelo.Paquete;
import ar.unrn.tp4.modelo.Seguro;

public class ServicioTest {

	@Test
	public void costoPaquete() {

		var paquete = new Paquete();

		var seguroMedico = new Seguro(3200);
		var seguroAuto = new Seguro(1500);
		var seguroHogar = new Seguro(1000);

		paquete.agregarServicio(seguroMedico);
		paquete.agregarServicio(seguroAuto);
		paquete.agregarServicio(seguroHogar);

		double valorReal = paquete.montoTotal();
		assertEquals(5700, valorReal);

	}

	@Test
	public void costoSeguro() {

		var seguroMedico = new Seguro(3200);
		var seguroAuto = new Seguro(1500);
		var seguroHogar = new Seguro(1000);

		assertEquals(3200, seguroMedico.montoTotal());
		assertEquals(1500, seguroAuto.montoTotal());
		assertEquals(1000, seguroHogar.montoTotal());

	}

}
