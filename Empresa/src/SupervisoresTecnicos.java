import java.util.Scanner;

public class SupervisoresTecnicos extends Empleado {
	public SupervisoresTecnicos(String nombre, String cedula, int codigo) {
		super(nombre, cedula, codigo);
	}

	public void Sueldo(double salario) {
		System.out.println("Ingrese los años laborales:");
		Scanner entrada1 = new Scanner(System.in);
		anio = entrada1.nextInt();
		Scanner in1 = new Scanner(System.in);
		this.salario=salario+(salario*((anio*5)/100));
	}

}
