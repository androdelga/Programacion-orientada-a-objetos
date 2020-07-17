
public class PruebaVectors {

	public static void main(String[] args) {
		//Un arreglo
		int [] numeros = new int[5];
		
		numeros[0]= 1;
		numeros[1]= 10;
		numeros[2]= 100;
		numeros[3]= 1000;
		numeros[4]= 10000;
		
		System.out.println(numeros.length);

		
		for(int i= 0; i<numeros.length;i++) {
			System.out.println("[" + i + "]: " + numeros[i]);
		}
		System.out.println("Posición 4: " + numeros[4]);
	}

}
