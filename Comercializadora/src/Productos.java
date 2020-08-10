
public abstract class Productos  extends Empresa{
    public int codigo;
    public double precio, iva, desc;

    public Productos(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
        this.desc = desc;
        this.iva = iva;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIva() {
        return iva;
    }

    public double getDesc() {
        return desc;
    }

    public abstract void PrecioVenta();
    
    
}
