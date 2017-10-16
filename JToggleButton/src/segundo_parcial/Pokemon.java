
package segundo_parcial;

public class Pokemon {
    String Tipo;
    String Dueño;
    Double Altura;
    Double Peso;
    int Nivel;
    String Nombre;

    public Pokemon() {
        System.out.println("Se a creado un pokemon");
    }

    public Pokemon(String Tipo, String Dueño, Double Altura, Double Peso, int Nivel, String Nombre) {
        this.Tipo = Tipo;
        this.Dueño = Dueño;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Nivel = Nivel;
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getDueño() {
        return Dueño;
    }

    public Double getAltura() {
        return Altura;
    }

    public Double getPeso() {
        return Peso;
    }

    public int getNivel() {
        return Nivel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public void setAltura(Double Altura) {
        this.Altura = Altura;
    }

    public void setPeso(Double Peso) {
        this.Peso = Peso;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "Tipo=" + Tipo + ", Due\u00f1o=" + Dueño + ", Altura=" + Altura + ", Peso=" + Peso + ", Nivel=" + Nivel + ", Nombre=" + Nombre + '}';
    }
    
}

