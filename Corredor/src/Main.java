
public class Main {

	public static void main(String[] args) {
		Corredor cor1 = new Corredor(20);
	    Corredor cor2 = new Corredor(45);
	       
	       cor1.verificarEnergia();
	       cor1.recargarEnergia(90);
	       cor1.verificarEnergia();
	       cor1.entrenar();
	       cor1.verificarEnergia();
	       
	       cor2.verificarEnergia();
	       cor2.recargarEnergia(55);
	       cor2.verificarEnergia();
	       cor2.entrenar();
	       cor2.verificarEnergia();

	}

}
