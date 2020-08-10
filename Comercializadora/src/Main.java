
public class Main {

	public static void main(String[] args) {
		Productos pro1 = new Libros(1, 10, "Pinocho", "Pepe", "Edicolor", 2000, "947555");
        Productos pro2 = new Cd(2, 5, "Despacito", "Luis Fonsi", 2016);
            
        pro1.PrecioVenta();
        pro2.PrecioVenta();
        
        System.out.println(pro1.getPrecio());
        System.out.println(pro2.getPrecio());
        
        Empresa empresa = new Empresa();
        
        empresa.Agregar(pro1);
        empresa.Agregar(pro2);
        
        System.out.println(empresa.TotalProducto());
	}

}
