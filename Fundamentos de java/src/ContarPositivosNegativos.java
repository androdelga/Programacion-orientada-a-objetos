
public class ContarPositivosNegativos {

	public static void main(String[] args) {
int [] numeros = new int[] {
	0, -3, 9, 4, 16, 18, -9, 0, 23, -55 
};

		System.out.println(numeros.length);
		int ceros=0, positivos=0, negativos=0;
		int sumapositivos=0, sumanegativos=0;
		for(int i= 0; i<numeros.length;i++) {
			if(numeros[i]==0) {
			ceros++;
			} else if(numeros[i]<0) {
				negativos++;
				sumanegativos=sumanegativos+numeros[i];
			} else {
				positivos++;
				sumapositivos=sumapositivos+numeros[i];
			}
		}
		System.out.println("La suma de positivos es: " + sumapositivos);
		System.out.println("La suma de positivos es: " + sumanegativos);
		System.out.println("La cantidad de numeros ceros es: " + ceros);
		System.out.println("La cantidad de numeros negativos es: " + negativos);
		System.out.println("La cantidad de numeros positivos es: " + positivos);
	}

}
