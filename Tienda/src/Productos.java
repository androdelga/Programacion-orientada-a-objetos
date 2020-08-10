
public class Productos extends Almacen{
	private String descripcion, fecha;
	private double iva, precio,i=0.09;
	private int codigo;
	public String getDescripcion() {
		return descripcion;
	}
	
	public Productos(int codigo, String fecha,String descripcion, double precio ) {
		this.codigo= codigo;
		this.fecha = fecha;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void consultar() {
		System.out.println("El codigo del producto es " + codigo + " su fecha de creación es " + fecha + " tiene como descripción " + descripcion + " el precio es " + getPrecio());
	}
	
	public void modificar(int codigo, String fecha, double precio) {
		this.codigo= codigo;
		this.fecha = fecha;
		this.precio = precio;
	}
		
	public void Total() {
		iva= precio*i;
		precio = precio + iva;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nCodigo: ");
		sb.append(codigo);
		sb.append("\nFecha de Creación: ");
		sb.append(fecha);
		sb.append("\nDescripción: ");
		sb.append(descripcion);
		sb.append("\nPrecio: ");
		sb.append(precio);
		return sb.toString();
	}
	
}
