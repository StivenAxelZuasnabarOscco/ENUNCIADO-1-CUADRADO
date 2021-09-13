package Ejercicios;

public class CSueldos {

    int HorasTrabajadas;
    float Tarifa;
    float categoria;
    private float numhijos;
    double descuento;
    double aumento;
    double sueldobruto;

    public CSueldos() {

    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }

    public float getTarifa() {

        return Tarifa;
    }

    public void setTarifa(float Tarifa) {
        this.Tarifa = Tarifa;
    }

    public void setCategoria(float categoria) {
        this.categoria = categoria;
    }

    public float getCategoria() {
        return categoria;
    }

    public void setNumhijos(float numhijos) {
        this.numhijos = numhijos;
    }

    public float getNumhijos() {
        return numhijos;
    }

    public float Tarifa() {

        if (categoria == 0) {
            Tarifa = 45;
        }
        if (categoria == 1) {
            Tarifa = (float) 37.5;
        }

        return Tarifa;

    }

    public float SueldoBasico() {

        return Tarifa() * HorasTrabajadas;

    }

    public float Bonificacion() {

        if (numhijos <= 3) {
            aumento = 40.5 * numhijos;
        }
        if (numhijos > 3) {
            aumento = 35 * numhijos;
        }

        return  (float) aumento;

    }

    public double Sueldobruto() {

        return SueldoBasico()+ Bonificacion() ;

    }

    public double descuento() {

        if (Sueldobruto() >= 3500) {
            descuento = (0.135) * Sueldobruto();
        }
        if (Sueldobruto() < 3500) {
            descuento = (0.1) * Sueldobruto();
        }
        return descuento;

    }

    public double SueldoNeto() {

        return Sueldobruto() - descuento();

    }
}
