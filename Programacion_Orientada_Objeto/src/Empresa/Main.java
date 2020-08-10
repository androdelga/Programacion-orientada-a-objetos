package Empresa;

public class Main {

	public static void main(String[] args) {
		Empleado ofc1 = new Oficinista("1", 500);
		Empleado ofc2 = new Oficinista("2", 500);
		
		Empleado sup1 = new Supervisores("3", 600,5);
		Empleado sup2 = new Supervisores("4", 700,4);
		
		Empleado ger1 = new Gerente("5", 800,6,100);
		Empleado ger2 = new Gerente("6", 900,2,200);
		
		System.out.println(ofc1.getSalario());
		System.out.println(ofc2.getSalario());
		System.out.println(sup1.getSalario());
		System.out.println(sup2.getSalario());
		System.out.println(ger1.getSalario());
		System.out.println(ger2.getSalario());
		
		Empresa empresa = new Empresa();
		
		
		empresa.contratar(ofc1);
		empresa.contratar(ofc2);
		empresa.contratar(sup1);
		
		
		System.out.println(empresa.totalEmpleados());
		System.out.println(empresa.diaDePago());
	}
}
