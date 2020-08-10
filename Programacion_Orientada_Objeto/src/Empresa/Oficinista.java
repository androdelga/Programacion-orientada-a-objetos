package Empresa;

public class Oficinista extends Empleado {

	public Oficinista(String identificacion, double salario) {
		super(identificacion, salario);
	}
	public double getSalario() {
		return salario;
	}
}
