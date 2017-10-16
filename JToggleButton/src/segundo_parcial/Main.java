
package segundo_parcial;

public class Main {
      public static void main(String[] args) {
        Alumno nubia=new Alumno();
        nubia.setNombre("Nubia Henrnández");
        nubia.setEspecialidad("Programación");
        nubia.setSexo("Femenino");
        nubia.setEdad(17);
        nubia.setNumeroControl(210);
        nubia.setGrupo(303);
        System.out.println(nubia.toString());
        Alumno ana=new Alumno();
        ana.setNombre("Ana Gonzalez");
        ana.setEspecialidad("Programación");
        ana.setSexo("Femenino");
        ana.setEdad(16);
        ana.setNumeroControl(584);
        ana.setGrupo(303);
        System.out.println(ana.toString());
        Alumno carlos=new Alumno();
        carlos.setNombre("Carlos Bolaños");
        carlos.setEspecialidad("Programación");
        carlos.setSexo("Masculino");
        carlos.setEdad(16);
        carlos.setNumeroControl(383);
        carlos.setGrupo(503);
        System.out.println(carlos.toString());
        
        Auto jetta=new Auto();
        jetta.setMatricula(15497);
        jetta.setAño(2003);
        jetta.setDueño("Roberto Hernández");
        jetta.setColor("Rojo");
        jetta.setModelo("Jetta");
        jetta.setNumeropuertas(4);
        System.out.println(jetta.toString());
        
        Auto jeep=new Auto();
        jeep.setMatricula(16062014);
        jeep.setAño(2012);
        jeep.setDueño("Maria Mejia");
        jeep.setColor("Negro");
        jeep.setModelo("Jeep");
        jeep.setNumeropuertas(5);
        System.out.println(jeep.toString());
        
        Auto audi=new Auto();
        audi.setMatricula(784561);
        audi.setAño(2007);
        audi.setDueño("Ángel Domínguez");
        audi.setColor("Blanco");
        audi.setModelo("Audi");
        audi.setNumeropuertas(4);
        System.out.println(audi.toString());
        
        Pokemon mewtwo=new Pokemon( "psiquico", "Ana Itzel", 2.0, 40.0, 1, "Newtwo");
        System.out.println(mewtwo.toString());
        Pokemon Pikachu=new Pokemon("Electrico", "Ash", 50.0, 10.0, 2, "Pikachu");
        System.out.println(Pikachu.toString());
        Pokemon vaporeon=new Pokemon("Agua", "Ash", 1.0, 10.0, 1, "vaporeon");
        System.out.println(Pikachu.toString());
    }
} 

