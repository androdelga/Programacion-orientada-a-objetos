package Constructores;
import zoologico.Gato;
import zoologico.Jirafa;
import zoologico.Tigre;

public class Main {

	public static void main(String[] args) {
		
		Tigre tigre = new Tigre();
		tigre.sonido();
		
		Jirafa jirafa = new Jirafa();
		jirafa.sonido();
		
		Gato gato = new Gato();
		gato.sonido();
		/*Persona pr1 = new Persona();
		pr1.setNombre("Cesar");
		
		Persona pr2 = new Persona("Galo");
		
		Persona pr3 = new Persona("Cesar", "Alcivar", 36);
				
		System.out.println(pr1.getNombre());
		System.out.println(pr2.getNombre());
		System.out.println(pr3.getNombre() + " " + pr3.getApellido() + " " + pr3.getEdad());
		
		System.out.println("\n\n Auto:");
		
		Auto a1 = new Auto(200);
		a1.setVelocidad(100);
		System.out.println(a1.getVelocidad());
		*/
		
	}

}
