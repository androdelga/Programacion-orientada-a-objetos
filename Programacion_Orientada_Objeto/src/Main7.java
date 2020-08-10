
public class Main7 {
public static void main(String[] args) {
	Player j1 = new Player();
	j1.nombre = "Cesar";
			
	Player j2 = new Player();
	j2.nombre = "Galor";
	Player j3 = new Player();
	j3.localizaciony = 100;
	Player j4 = new Player();
	j4.localizaciony = 300;
	Player j5 = new Player();
	j5.localizaciony = 10;
	
	System.out.println("Vida j1: " +j1.vida);
	System.out.println("Vida j2: " +j2.vida);
	j1.golpear(j2);
	
	System.out.println("Vida j1: " + j1.vida);
	System.out.println("Vida j2: " +j2.vida);
	
	j1.mover();
	j2.mover();
	
	j1.golpear(j2);
	
	System.out.println("Vida j1: " +j1.vida);
	System.out.println("Vida j2: " +j2.vida);
}
}
