
public class Libro {
    private double precio;
    private int cantidad, codigo;
    private String titulo, autor;

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}   
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();                                                                   
        sb.append("\nCodigo: ");
        sb.append(codigo);
        sb.append("\nTitulo: ");
        sb.append(titulo);
        sb.append("\nAutor: ");
        sb.append(autor);
        sb.append("\nPrecio: ");
        sb.append(precio);
        sb.append("\nCantidad: ");
        sb.append(cantidad);   
        return sb.toString();
    }

	
    
    
    
}
