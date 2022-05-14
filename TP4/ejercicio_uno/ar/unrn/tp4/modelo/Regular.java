package ar.unrn.tp4.modelo;

public class Regular implements Empleado {

	private double salario;

	public Regular(double salario) {
		this.salario = salario;
	}

	@Override
	public void agregarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public double salarioDeEmpleado() {
		// TODO Auto-generated method stub
		return this.salario;
	}

}
