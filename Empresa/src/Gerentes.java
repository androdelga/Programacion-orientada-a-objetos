import java.util.Scanner;

public class Gerentes extends Empleado {
	public Gerentes(String nombre, String cedula, int codigo) {
		super(nombre, cedula, codigo);
		// TODO Auto-generated constructor stub
	}
	
	
	public void Sueldo(double salario) {
		System.out.println("Ingrese los años laborales:");
		Scanner entrada1 = new Scanner(System.in);
		anio = entrada1.nextInt();
		Scanner in1 = new Scanner(System.in);
		double bono= salario-(salario-80);
		this.salario=salario+(salario*((anio*5)/100))+bono;
}

}


