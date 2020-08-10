
public class Main {
	public static void main(String[] args) {
		Productos pro1 = new Productos(1, "19-3-2018","Manzana", 6);
		Productos pro2 = new Productos(2, "25-11-2019","Banana", 4);
		Productos pro3 = new Productos(3, "07-4-2020", "Uva", 2);
		
		pro1.consultar();
		pro2.consultar();
		pro3.consultar();
		pro1.modificar(4, "23-4-2020", 5);
		pro3.modificar(7, "23-1-2019", 3);
		pro1.Total();
		pro2.Total();
		pro3.Total();
		pro1.consultar();
		pro2.consultar();
		pro3.consultar();
		
		Almacen almacen = new Almacen();
		
		almacen.AgregarProducto(pro1);
		almacen.AgregarProducto(pro2);
		almacen.AgregarProducto(pro3);
		
		almacen.Mostrar();
		
		
	}
}
