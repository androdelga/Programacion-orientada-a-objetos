
public class Main4 {

	public static void main(String[] args) {
		Punto pt1= new Punto();
		pt1.x= 1;
		pt1.y = 2;
		
		Punto pt2 = new Punto();
		pt2.x= 10;
		pt2.y= 5;
		
		double distancia= pt1.distancia(pt2);
		System.out.println(distancia);
		
		pt1.x = 1;
		pt1.y= 2;
		pt2.x = 3;
		pt2.y = 3;
		Punto r = pt1.suma(pt2);
		System.out.println(r.x + ", " + r.y);
	    
		pt1.x = 1;
		pt1.y= 4;
		pt2.x = 7;
		pt2.y = 3;
		double result1 = pt1.sumaescalar(pt2);
		System.out.println(result1);
	}

}
