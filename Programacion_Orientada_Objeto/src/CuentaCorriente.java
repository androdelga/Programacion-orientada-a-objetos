
public class CuentaCorriente {

	public static int contador;
	
	public static void sumarContador() {
		contador+=100;
	}
		
		public double saldo=0;
		
		public double getSaldo() {
			return saldo;
		}
		public void deposito(double dinero) {
			saldo += dinero;
		}
		public void retiro(double dinero) {
			if(dinero>0)
				saldo -= dinero;
		}
}
