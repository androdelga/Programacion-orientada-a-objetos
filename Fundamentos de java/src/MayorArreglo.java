

public class MayorArreglo {

	public static void main(String[] args) {
		int [] numeros = new int[] {
				0, -3, 9, 40, 16, 18, -9, 0, 24, -57 
};
		int posicion = -1;
		int max=numeros[0];
		for(int i= 0; i<numeros.length;i++) {
			if(max<numeros[i]) {
				max=numeros[i];
				posicion= i;
			}
		}
		System.out.println("El valor maximo es:" + max);
		System.out.println("La posicion es: " + posicion);
	}

}
