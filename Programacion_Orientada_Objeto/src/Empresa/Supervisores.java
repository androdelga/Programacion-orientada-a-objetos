package Empresa;

public class Supervisores extends Empleado {
	private int anioTrabajados;
	public Supervisores(String identificacion, double salario, int anioTrabajados) {
		super(identificacion, salario);
		this.anioTrabajados = anioTrabajados;
	}
	public int getAnioTrabajados() {
		return anioTrabajados;
	}
	public void setAnioTrabajados(int anioTrabajados) {
		this.anioTrabajados = anioTrabajados;
	}

	public double getSalario() {
		double salario = super.getSalario();
		double aumento = 0;
		for(int i=0; i<anioTrabajados;i++) {
			aumento += salario*0.05;
		}
		return salario + aumento;
	}
	
}
