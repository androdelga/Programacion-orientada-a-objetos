import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		CuentaCorriente cta1= new CuentaCorriente();
		CuentaCorriente cta2 = new CuentaCorriente();
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresar cantidad de deposito para cta1");
		double dinero = in.nextDouble();
		cta1.deposito(dinero);
		
		System.out.println("Ingresar cantidad de deposito para cta2");
		dinero= in.nextDouble();
		cta2.deposito(dinero);
				
		System.out.println("Saldo cta1: " + cta1.getSaldo());
		System.out.println("Saldo cta2: " + cta2.getSaldo());
	}

}
