import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
public class Empresa {
	
	
	public static double  diaDePago(ArrayList<Empleado>empleados) {
		double salario=0;
		for(int i = 0; i<empleados.size();i++) {
			Empleado emp = empleados.get(i);
			if(emp instanceof Oficinista) {
				Oficinista empofi = (Oficinista) emp;
			}
			else if(emp instanceof SupervisoresTecnicos) {
				SupervisoresTecnicos empsut = (SupervisoresTecnicos) emp;
			} 
			else if(emp instanceof Gerentes){
				Gerentes empge = (Gerentes) emp;
			}
			salario +=emp.getSalario();
		}
		return salario;
	}

	public static void main(String[] args) {
		double salario;
		ArrayList<Empleado>empleados = new ArrayList<>();
		Empleado emp1 = new Oficinista("Luis", "0923843512", 893);
		Empleado emp2 = new SupervisoresTecnicos("Carla", "0948502342", 912);
		Empleado emp3 = new Gerentes("Ricardo", "0932198350",157);
		Empleado emp4 = new SupervisoresTecnicos("Lisa", "0947569232",912);
		Empleado emp5 = new Oficinista("Saul", "0901245984",893);
		Empleado emp6 = new Gerentes("Samantha", "098930377",157);
		
		
		System.out.println("Ingrese el salario fijo:");
		Scanner entrada = new Scanner(System.in);
		salario = entrada.nextInt();
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nPimer empleado");
		emp1.Sueldo(salario);
		System.out.println("El Salario del Primer empleado es " + emp1.getSalario());
		System.out.println("\nSegundo empleado");
		emp2.Sueldo(salario); 
		System.out.println("El Salario del Segundo empleado es " + emp2.getSalario());
		System.out.println("\nTercer empleado");
		emp3.Sueldo(salario);
		System.out.println("El Salario del Tercer empleado es " + emp3.getSalario());
		System.out.println("\nCuarto empleado");
		emp4.Sueldo(salario);
		System.out.println("El Salario del Cuarto empleado es " + emp4.getSalario());
		System.out.println("\nQuinto empleado");
		emp5.Sueldo(salario);
		System.out.println("El Salario del Quinto empleado es " + emp5.getSalario());
		System.out.println("\nSexto empleado");
		emp6.Sueldo(salario);
		System.out.println("El Salario del Tercer empleado es " + emp6.getSalario());
		
		empleados.add(emp1);
		empleados.add(emp2);
		empleados.add(emp3);
		empleados.add(emp4);
		empleados.add(emp5);
		empleados.add(emp6);
		System.out.println("El total a pagar de la empresa a los empleados es " + diaDePago(empleados));
	}
	
}
