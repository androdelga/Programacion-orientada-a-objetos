import java.util.ArrayList;

public class Almacen {

	private  ArrayList<Productos>productos = new ArrayList<>();
	
	public void AgregarProducto(Productos producto) {
		productos.add(producto);
	}
	
	public void Mostrar() {
		for (int i = 0; i < productos.size(); i++) {
			System.out.println(productos.get(i));
		}
	}
	
}
