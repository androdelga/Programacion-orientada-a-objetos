import java.util.ArrayList;

public class Empresa {

	private  ArrayList<Productos>productos = new ArrayList<>();
	
	public void Agregar(Productos producto) {
		productos.add(producto);
	}
	
	public int TotalProducto() {
		return productos.size();
	}
	
}
