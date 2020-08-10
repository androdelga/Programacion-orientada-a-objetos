package Empresa;

public class Gerente extends Supervisores{
	public Gerente(String identificacion, double salario, int anioTrabajados, double viaticos) {
		super(identificacion, salario, anioTrabajados);
		this.viaticos=viaticos;
	}

	private double viaticos;
	
	public double getSalario() {
		return super.getSalario() + viaticos;
	}
	
	
	
}
