package Ejercicios;

public class CAtCliente {

    private int Tenfermedad;
    private int genero;
    private double Cpaciente;
    private int edad;
    private double aumento;
    private int dias;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDias() {

        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float getEnfermedad() {

        return Tenfermedad;
    }

    public void setEnfermedad(int Tenfermedad) {

        this.Tenfermedad = Tenfermedad;

    }

    public float getTGenero() {

        return genero;
    }

    public void setTGenero(int genero) {

        this.genero = genero;

    }

    public double CPaciente() {

        if (Tenfermedad == 0) {
            Cpaciente = 135 * dias;
        }
        if (Tenfermedad == 1) {
            Cpaciente = 323 * dias;
        }
        if (Tenfermedad == 2) {
            Cpaciente = 425 * dias;
        }
        if (Tenfermedad == 3) {
            Cpaciente = 678 * dias;
        }

        return Cpaciente;

    }

    public double CTotal() {

        if (edad < 18) {
            aumento = (CPaciente() * (0.35));
        }
        if (genero == 1 && Tenfermedad == 0) {
            aumento = (CPaciente() * (0.12));
        }
        if (genero == 1 && Tenfermedad > 0) {
            aumento = 0;
        }
         if (genero == 0 && Tenfermedad >= 0) {
            aumento = 0;
        }

        

        return CPaciente() + aumento;

    }

}
