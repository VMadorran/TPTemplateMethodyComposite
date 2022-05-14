package ar.unrn.tp4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ar.unrn.tp4.modelo.EmpleadoACargo;
import ar.unrn.tp4.modelo.Regular;

public class EmpleadosTest {

	@Test
	public void sueldoEmpleadoRegular() {
		var empleado = new Regular(75000);

		assertEquals(75000, empleado.salarioDeEmpleado());
	}

	@Test
	public void sueldoEmpleadoACargo() {

		var gerente = new EmpleadoACargo(200000);
		var liderDeProyecto = new EmpleadoACargo(150000);
		var empleadoRegular = new Regular(80000);
		var empleadoRegularDos = new Regular(60000);
		var empleadoRegularTres = new Regular(65000);

		liderDeProyecto.agregarEmpleado(empleadoRegular);
		liderDeProyecto.agregarEmpleado(empleadoRegularDos);
		liderDeProyecto.agregarEmpleado(empleadoRegularTres);

		gerente.agregarEmpleado(liderDeProyecto);

		assertEquals(555000, gerente.salarioDeEmpleado());
		assertEquals(355000, liderDeProyecto.salarioDeEmpleado());

	}

}
