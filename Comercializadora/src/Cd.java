
public class Cd extends Productos {
    private double i=0.09, d=0.1;
    private String nombre, interprete;
    private int anio;
    public Cd(int codigo, double precio, String nombre, String interprete, int anio) {
        super(codigo, precio);
    }


    public String getTitulo() {
        return nombre;
    }

    public String getInterprete() {
        return interprete;
    }

    public int getAnio() {
        return anio;
    }


    public void setTitulo(String titulo) {
        this.nombre = nombre;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
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
