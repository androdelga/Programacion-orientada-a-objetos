package Poo;

public class Main {
	int contador;
	static int suma = 100;// variable
	
	public void contar() { // m�todo
		contador++;
	}
	
	public static void sumar() { //m�todo
		suma++;
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.contador=100;
		main.contar();
		
		
		Main.sumar();
		sumar();
		Main.suma = 100;
		suma = 100;

	}

}
