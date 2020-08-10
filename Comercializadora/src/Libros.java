
public class Libros extends Productos{
    private double i=0.04,d=0.2;
    private String titulo, autor, editorial, isbn;
    private int anio;
    public Libros(int codigo, double precio, String titulo, String autor, String editorial, int anio , String isbn) {
        super(codigo, precio);
    }

    

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnio() {
        return anio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void PrecioVenta(){
        iva = precio*i;
        desc = precio*d;
        precio=precio+iva-desc;
    }
    
}
