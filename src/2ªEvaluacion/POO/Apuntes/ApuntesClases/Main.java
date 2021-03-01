package POO.Apuntes.ApuntesClases;

import java.security.Principal;

//en español se puede llamar principal xj
public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(); //ya se crea un objeto de la clase paciente, cuando se crea un objeto siempre new
    paciente1.nombre = "A. Alvarez"; //Llamo al objeto y le asigno un valor a nombre
    paciente1.edad = 20;
    paciente1.altura = 170;
String [] sintoma = {"Tos","Fiebre","Cansancio"};
        paciente1.sintomas = sintoma;
    System.out.println("el paciente " + paciente1.nombre + " de edad " + paciente1.edad + " años, con la altura " + paciente1.altura
            + " tiene los siguientes sintomas: ");

        for (int i = 0; i < paciente1.sintomas.length; i++) {
            System.out.println(" * " + paciente1.sintomas[i]);
        }
        Paciente paciente2 = new Paciente();
        paciente2.nombre = "C. Bouzas";
        paciente2.edad = 29;
        System.out.println("el paciente " + paciente2.nombre + " de edad " + paciente2.edad + " años, con la altura " + paciente2.altura
                + " tiene los siguientes sintomas: ");
        paciente2.sintomas = paciente1.sintomas;
        for (int i = 0; i < paciente2.sintomas.length; i++) {
            System.out.println(" * " + paciente2.sintomas[i]);
        }
        String [] sintomas2 = {"Dolor estomacal","Nauseas","Diarrea"};
        Paciente paciente3 = new Paciente("H. Hidalgo",35,176,sintomas2);
        System.out.println("el paciente " + paciente3.nombre + " de edad " + paciente3.edad + " años, con la altura " + paciente3.altura
                + " tiene los siguientes sintomas: ");
    for (int i = 0; i < paciente3.sintomas.length; i++) {
        System.out.println(" * " + paciente3.sintomas[i]);
    }
    //llamamos a toString()
       String p = paciente1.toString();
        System.out.println(p);


    }
}


