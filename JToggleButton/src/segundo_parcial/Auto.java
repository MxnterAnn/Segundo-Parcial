package segundo_parcial;

public class Auto {

    int Matricula;
    String Modelo;
    String Color;
    String Dueño;
    int año;
    int numeropuertas;

    public Auto() {
        System.out.println("Se creo un nuevo auto");
    }

    public Auto(int Matricula, String Modelo, String Color, String Dueño, int año, int numeropuertas) {
        this.Matricula = Matricula;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Dueño = Dueño;
        this.año = año;
        this.numeropuertas = numeropuertas;
    }

    public int getMatricula() {
        return Matricula;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getColor() {
        return Color;
    }

    public String getDueño() {
        return Dueño;
    }

    public int getAño() {
        return año;
    }

    public int getNumeropuertas() {
        return numeropuertas;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }

    @Override
    public String toString() {
        return "Auto{" + "Matricula=" + Matricula + ", Modelo=" + Modelo + ", Color=" + Color + ", Due\u00f1o=" + Dueño + ", a\u00f1o=" + año + ", numeropuertas=" + numeropuertas + '}';
    }

}

