package  clases;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;
    
    //Constructor predeterminado
    public Cafetera(){
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    //Constructor con capacidad máxima
    public Cafetera(int capacidadMax){
        this.capacidadMaxima = capacidadMax;
        this.cantidadActual = capacidadMax;
    }
    //constructor con capacidad máxima y cantida actual
    public Cafetera(int capacidadMax, int cantidadAct){
        this.capacidadMaxima = capacidadMax;
        if(cantidadAct > capacidadMax){
            this.cantidadActual = capacidadMax;
        } else {
            this.cantidadActual = cantidadAct;
        }
    }
    
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("La cafetera se llenó");
    }

    public void servirTaza(int capacidadTaza) {
        if(cantidadActual<capacidadTaza){
            System.out.println("Se sirvió: " + cantidadActual);
            vaciarCafetera();
        } else {
            System.out.println("Se llenó la taza");
            this.cantidadActual = cantidadActual - capacidadTaza;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
        System.out.println("Se vació la cafetera");
    }

    public void agregarCafe(int cantidad) {
        int faltaParaLlenar = capacidadMaxima - cantidadActual;
        if(cantidad>faltaParaLlenar){
            int sobro = cantidad - faltaParaLlenar;
            System.out.println("Se llenó la cafetera y sobró: "  + sobro + "cc.");
            llenarCafetera();
        } else {
            System.out.println("Se cargó: " + cantidad + "cc.");
            this.cantidadActual += cantidad;
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    @Override
    public String toString(){
        return "Cafetera con capacidad " + capacidadMaxima 
                + "cc. y contenido " + cantidadActual + "cc.";
    }
}
