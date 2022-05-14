package ar.unrn.tp4.modelo;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoACargo implements Empleado {

	private List<Empleado> empleados = new ArrayList<Empleado>();
	private double salario;

	public EmpleadoACargo(double salario) {
		this.salario = salario;
	}

	@Override
	public void agregarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleados.add(empleado);

	}

	@Override
	public double salarioDeEmpleado() {
		// TODO Auto-generated method stub
		double salarioDeEmpleados = 0;
		for (Empleado empleado : empleados) {
			salarioDeEmpleados += empleado.salarioDeEmpleado();
		}
		return this.salario + salarioDeEmpleados;
	}

}
