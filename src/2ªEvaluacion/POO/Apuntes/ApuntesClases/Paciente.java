package POO.Apuntes.ApuntesClases;

import java.util.Arrays;

public class Paciente {
    //una cosa son las clases y otras los objetos, los obejtos seran los casos concretos de la clase, que tendran las carecteristicas de la plantilla
    //atributos
    //nombre, edad, altura, sintomas
    String nombre;
    int edad;
    int altura;
    String[] sintomas;
    //se puede crear un objeto en esta clase, pero no seria util en la explicacion
    //constructor


    public Paciente(String nombre, int edad, int altura, String[] sintomas) {
        this.nombre = nombre; //this aparece siempre en los constructores, lo que hace es coger el parametro nombre y se lo va
        this.edad = edad;   // a asignas al nombre del objeto que estoy creando. Si el objeto es s sera s.nombre, s.edad, ...
        this.altura = altura;
        this.sintomas = sintomas;
    }

    public Paciente() {
        //Esto es un constructor por defecto, lo declaro explicitamente para que me valgan los constructores de aqui
        //y no interfiera con el mismo contructor que puse en Main, aqui funciona la sobrecarga de metodos.
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", sintomas=" + Arrays.toString(sintomas) +
                '}';
    }
}
