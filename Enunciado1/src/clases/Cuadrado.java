package clases;

public class Cuadrado {

    private float lado;

    public Cuadrado() {

    }

    public float getLado() {
        return lado;
    }
    
    public void setLado(float lado){
        this.lado = lado;
    }
    
    public float hallarArea(){
        float area;
        area = (float) Math.pow (lado,2);
        return area;
    }
    
    public float mostrarArea(){
        return hallarArea();
    }
}
