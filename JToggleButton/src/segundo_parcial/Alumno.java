
package segundo_parcial;

public class Alumno {
     int NumeroControl;
    String Nombre;
    int edad;
    String sexo;
    String especialidad;
    int grupo;

    public Alumno() {
        System.out .println("se creo un nuevo alumno");
    }

    public Alumno(int NumeroControl, String Nombre, int edad, String sexo, String especialidad, int grupo) {
        this.NumeroControl = NumeroControl;
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.especialidad = especialidad;
        this.grupo = grupo;
    }

    public int getNumeroControl() {
        return NumeroControl;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setNumeroControl(int NumeroControl) {
        this.NumeroControl = NumeroControl;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "NumeroControl=" + NumeroControl + ", Nombre=" + Nombre + ", edad=" + edad + ", sexo=" + sexo + ", especialidad=" + especialidad + ", grupo=" + grupo + '}';
    }

}

