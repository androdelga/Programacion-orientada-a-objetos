
public class CuentaAhorro extends CuentaBancaria{
	double valor=0;
	public void deposito(double dinero) {
		
		if (dinero < 1000) {
			valor= (dinero *2)/100;
			saldo = dinero+valor;
			
		}else {
			saldo += dinero;
		}	
	}
}
