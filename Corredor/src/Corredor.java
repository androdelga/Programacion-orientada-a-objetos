
public class Corredor {
	public Corredor(int energia) {
        this.energia = energia;
        this.cantidad = cantidad;
    }

    private int energia;
    private int cantidad;

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    public int getEnergia() {
        return energia;
    }
    
    public int verificarEnergia(){
        if(energia<0){
            System.out.println("Energia no válida");
            energia=0;
        } else if(energia>100){
            System.out.println("Energia no válida");
            energia=100;
        } else{
            System.out.println("Energia válida");
        }
        return energia;
    }
    
    public void recargarEnergia(int cantidad){
        energia = energia + cantidad;

    }
    
    public void correr(){
        energia = energia - 10;
    }
    
    public void energiaAgotada(){
        if(energia<10){
            energia=0;
            System.out.println("Se llego al minimo de energia");
            System.out.println("La energia del corredor es " + energia);
        }
    }
    
    public void entrenar(){
        energia = energia + 15;
        if(energia > 100){
            energia=100;
        }
    }
}
