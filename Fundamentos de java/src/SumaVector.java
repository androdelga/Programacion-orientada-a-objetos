
public class SumaVector {

	public static void main(String[] args) {
		int [] v1 = new int[] {
				1, -3, 6- 8, -9, 19, -20, 0, 200, 200
		};
		
		int[] v2 = new int[] {
				1, -3, 1, 1, 80,-9, 19, -20, 0, -50, 200
		};
		int sumav1= 0, sumav2=0;
		for(int i= 0; i<v1.length;i++) {
			sumav1= v1[i]+sumav1;
		}
		for(int j= 0; j<v2.length;j++) {
			
		}
		if(sumav1<sumav2) {
			System.out.println("El vector 2 es mayor" + sumav1);
		} else if(sumav1>sumav2) {
			System.out.println("El vector 1 es mayor" +sumav2);
		} else {
			System.out.println("Los dos vectores son iguales");
		}
		

	}

}
