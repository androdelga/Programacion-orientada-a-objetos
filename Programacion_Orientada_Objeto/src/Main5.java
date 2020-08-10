
public class Main5 {

	public static void subirVolumen(Tv tv) {
		tv.subirVolumen();
	}
	public static void subirVolumen(int volumen) {
		volumen = volumen + 10;
	}
	public static void main(String[] args) {
		int volumen = 100;
		Tv tv1 = new Tv();
		tv1.encender();
		tv1.subirVolumen();
		tv1.subirVolumen();
		
		subirVolumen(volumen);
		subirVolumen(tv1.volumen);
		subirVolumen(tv1);
		System.out.println(tv1.volumen);
		System.out.println(volumen);

	}

}
