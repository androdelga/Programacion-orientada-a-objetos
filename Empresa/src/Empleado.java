import java.util.Scanner;

public abstract class Empleado extends Empresa {
	String nombre, cedula;
	int codigo;
	double salario, anio, bono;
	
	public Empleado(String nombre, String cedula, int codigo) {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario=salario;
	}
	
	public double getAnio() {
		return anio;
	}

	public double getBono() {
		return bono;
	}	
	
	public void setBono(double bono) {
		this.bono=bono;
	}
	
	public abstract void Sueldo(double salario);
	
	
	
	
	
	
}
