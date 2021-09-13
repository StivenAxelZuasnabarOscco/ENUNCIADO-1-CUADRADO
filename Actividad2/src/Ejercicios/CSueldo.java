package Ejercicios;

public class CSueldo {

    int HorasTrabajadas;
    float Tarifa;

    public CSueldo() {

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

    public float SueldoBasico() {

        return Tarifa * HorasTrabajadas;

    }

    public float Sueldobruto() {

        return SueldoBasico() * 35 / 100 + SueldoBasico();

    }

    public float Sueldoneto() {

        return SueldoBasico() - SueldoBasico() * 12 / 100;

    }

}
