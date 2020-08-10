//clase(molde), 
//variables de instancia -- objeto -- instancia -- variable de referencia
//herencia, polimorfismo, abstraccion, encapsulamiento
//variables de clase (static) -- varieables y metodos estaticos
// variables primitivas int, float.....
// modificadores de acceso: public, private, protected, paquete



public class Main6 {

	void sumarContadorMain() {
		CuentaCorriente.contador += 100;
		sumarContadorMain1();
	}
	
	static void sumarContadorMain1() {
		CuentaCorriente.contador += 100;
		Main6 main = new Main6();
		main.sumarContadorMain();
	}

	public static void main(String[] args) {
		
		Main6 sm1 = new Main6();
		sm1.sumarContadorMain();
		
		
		Main6.sumarContadorMain1();
		sumarContadorMain1();
		
		
		CuentaCorriente.contador = 100;
		System.out.println(CuentaCorriente.contador);
		//CuentaCorriente.saldo = 100;
		
		CuentaCorriente cta = new CuentaCorriente();
		cta.saldo = 100;
		CuentaCorriente cta1 = new CuentaCorriente();
		cta1.saldo = 1000;
	}

}
