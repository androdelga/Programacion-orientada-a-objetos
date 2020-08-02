import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria ctaCorriente = new CuentaCorriente();
		CuentaAhorro ctaAhorro = new CuentaAhorro();
		boolean salir=false;
		while (!salir) {
			System.out.println("\n  CAJERO AUTOMATICO");
			System.out.println("----------------------");
			System.out.println("1.Depositar");
			System.out.println("2.Retirar");
			System.out.println("3.Consultar Saldo");
                        System.out.println("4.Salir");
			System.out.println("Digite Opción: ");
			Scanner entrada = new Scanner(System.in);
			int opcion = entrada.nextInt();
			
			Scanner in = new Scanner(System.in);
		
			
            if(opcion==1) {
                boolean terminar=false;
                while(!terminar){
				System.out.println("\n1.Cuenta Corriente");
				System.out.println("2.Cuenta Ahorro");
				System.out.println("Digite Opción: ");
                Scanner entrada1 = new Scanner(System.in);
				opcion = entrada.nextInt();
                Scanner in1 = new Scanner(System.in);
		
				if(opcion==1){
					System.out.println("Cantidad de deposito Cuenta Corriente: ");
					double dinero = in.nextDouble();
					ctaCorriente.deposito(dinero);
                                        terminar=true;
                                } else if(opcion==2){

					System.out.println("Cantidad de deposito Cuenta Ahorro: ");
					double dinero = in.nextDouble();
					ctaAhorro.deposito(dinero);
                                        terminar=true;
                                } else{
                                    System.out.println("\nOpcion no válida");
                                    System.out.println("Vuelva a digitar opción");
                                    terminar=false;
                                }
                                }
           }
           else if(opcion==2){
				boolean terminar=false;
                while(!terminar){
				System.out.println("\n1.Cuenta Corriente");
				System.out.println("2.Cuenta Ahorro");
				System.out.println("Digite Opción: ");
                Scanner entrada1 = new Scanner(System.in);
				opcion = entrada.nextInt();
                Scanner in1 = new Scanner(System.in);
		
				if(opcion==1){
					System.out.println("Cantidad de retiro Cuenta Corriente: ");
					double dinero = in.nextDouble();
					ctaCorriente.retiro(dinero);
                                        terminar=true;
                                } else if(opcion==2){

					System.out.println("Cantidad de retiro Cuenta Ahorro: ");
					double dinero = in.nextDouble();
					ctaAhorro.retiro(dinero);
                                        terminar=true;
                                } else{
                                    System.out.println("\nOpcion no válida");
                                    System.out.println("Vuelva a digitar opción");
                                    terminar=false;
                                }
                                }
           }
           else if(opcion==3){ 
				System.out.println("\nSaldo de Cuenta Corrinete: "+ ctaCorriente.getSaldo());
				System.out.println("Saldo de Cuenta Ahorro: "+ ctaAhorro.getSaldo());
           } 
           else if(opcion==4){
				System.out.println("\nGracias por su atención");
                salir=true;    
           } else{
				System.out.println("\nOpción no válida");
                System.out.println("Vuelva a digitar opción");
			}
		}	
		
	}

}
