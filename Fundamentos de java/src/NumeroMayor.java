
public class NumeroMayor {

	public static void main(String[] args) {
		int n1= 10;
		int n2= 11;
		int n3= 12;
		
		String mensaje = "";
		
		if(n1> n2 && n1 > n3) {
			mensaje = n1 + " Es el mayor"; 
		} else if(n2 > n1 && n2 > n3) {
			mensaje = n2 + " Es el mayor"; 
		} else {
			mensaje = n3 + " Es el mayor"; 
		}
		
		System.out.println(mensaje);

	}

}
