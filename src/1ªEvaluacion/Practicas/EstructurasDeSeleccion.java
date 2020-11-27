package Practicas;
import java.util.Scanner;
public class EstructurasDeSeleccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;   //primero declaro dos variables i y j, que son las que usare mas adelante.
        int j = 0;
        System.out.println("¿Quieres empezar los ejercicios?: \n 1.SI 2.NO");
        var empezarONo = sc.next(); // Pregunto si se quiere empezar a responder preguntas o no, abro un switch
        switch (empezarONo) {  // y un solo caso donde agrupo todas las respuestas que consifero positivas,
            case "1": // todo lo demas iran a al ultima default.
        /* Hago un for para clear un bucle. Lo que hago es darle la variable i antes declarada y le digo que mientras
         i valga menos o igual a 5 ejecute las intrucciones dentro del bucle  */
                for (i = 1; i <= 5; ) {
            /* A continuacion le aumento antes de su uso tanto a i como a j (mas abajo explico j),esto es para que
            cada vez que empiece el bucle se aumente i y la repeticion del bucle sea la cantidas de veces que queramos
             en este caso 5, pero cambiando la condicion i <= 5 de for se podria aumentar o disminuir, quitando el
             aumento que hago dentro del for el bucle sera infinito. */
                    ++i;
                    ++j;
                    System.out.println("¿Sobre qué tipo de estructura quieres resolver ejercicios? \n1. if \n2. switch");
                    int ifOrSwitch = sc.nextInt();
                    if (ifOrSwitch == 1) {
                        System.out.println("Introduce el Numero de ejercicio que quieres que resuelva: \n 1. Par-impar \n 2. Sueldo anual (impuestos) \n 5. Triangulo válido \n 6.Fiesta de marmotas \n 7. Notas");
                        int ejerciciosIf = sc.nextInt();
                        switch (ejerciciosIf) {
                            case 1:
                                System.out.println("Introduzca un número: ");
                                int parImpar = sc.nextInt();
                                if (parImpar % 2 == 0) {
                                    System.out.println("El numero introducido " + parImpar + " es par.");
                                } else {
                                    System.out.println("El numero introducido " + parImpar + " es impar.");
                                }
                                break;
                            case 2:
                                System.out.println("¿Canto cobra al año?");
                                long sueldo = sc.nextInt();
                                if (sueldo <= 9_000) {
                                    System.out.println("No tienes pagar impuestos");
                                } else {
                                    System.out.println("Tienes pagar impuestos");
                                }
                                break;
                            case 5:
                                System.out.println("Introduce las medidas de los lados:");
                                System.out.println("Lado A: ");
                                int ladoA = sc.nextInt();
                                System.out.println("Lado B: ");
                                int ladoB = sc.nextInt();
                                System.out.println("Lado C: ");
                                int ladoC = sc.nextInt();
                                if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
                                    System.out.println("Si puede ser un triangulo.");
                                } else {
                                    System.out.println("No puede ser un triangulo.");
                                }
                                break;
                            case 6:
                                System.out.println("¿Cuantas tazas de mantequilla hay? : ");
                                int mantequilla = sc.nextInt();
                                System.out.println("¿Que día de la semana es? : (del 1 (Lunes) al 7 (domingo))");
                                int diaDeLaSemana = sc.nextInt();
                                if ((mantequilla >= 10 && mantequilla <= 20) && (diaDeLaSemana >= 1 && diaDeLaSemana <= 5) || (mantequilla >= 15 && mantequilla <= 25) && (diaDeLaSemana == 6 || diaDeLaSemana == 7)) {
                                    System.out.println("La fiesta sera un exito.");
                                } else {
                                    System.out.println("La fiesta no tendra exito.");
                                }
                                break;
                            case 7:
                                System.out.println("¿Que nota sacó?: ");
                                int nota = sc.nextInt();
                                switch (nota) {
                                    case 0:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 1:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 2:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 4:
                                        System.out.println("Su calificación  " + nota + " fue INS, insuficiente.");
                                        break;
                                    case 3:
                                        System.out.println("Su calificación  " + nota + " fue INS, insuficiente.");
                                        break;
                                    case 5:
                                        System.out.println("Su calificación " + nota + "  fue SUF, suficinte.");
                                        break;
                                    case 6:
                                        System.out.println("Su calificación " + nota + "  fue B, bien.");
                                        break;
                                    case 8:
                                        System.out.println("Su calificación " + nota + " fue N, notable.");
                                        break;
                                    case 7:
                                        System.out.println("Su calificación " + nota + " fue N, notable.");
                                        break;
                                    case 9:
                                        System.out.println("Su calificación " + nota + " fue SB, sobresaliente.");
                                        break;
                                    case 10:
                                        System.out.println("Su calificación " + nota + " fue SB, sobresaliente.");
                                        break;
                                    default:
                                        System.out.println("Su nota " + nota + " incorrecta.");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("El ejercicio " + ejerciciosIf + " no forma parte de la pactica.");
                                break;
                        }
                    } else if (ifOrSwitch == 2) {
                        System.out.println("Introduce el numero de ejercicio que quieres que resuelva: \n 2.Lenguajes aprendidos: \n 3.Transformar números: \n 4.Casas Hogwarts \n 5.Direcciones: ");
                        int ejerciciosSwitch = sc.nextInt();
                        switch (ejerciciosSwitch) {
                            case 2:
                                System.out.println("¿Qué lenguaje está estudiando?: \n a.Java \n b.Kotlin \n c.Scala \n d.Python");
                                var lenguajeJava = sc.next();
                                switch (lenguajeJava) {
                                    case "a":
                                        System.out.println("¡SI!");
                                        break;
                                    case "java":
                                        System.out.println("¡SI!");
                                        break;
                                    case "Java":
                                        System.out.println("¡SI!");
                                        break;
                                    case "b":
                                        System.out.println("¡NO!");
                                        break;
                                    case "c":
                                        System.out.println("¡NO!");
                                        break;
                                    case "python":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Python":
                                        System.out.println("¡NO!");
                                        break;
                                    case "scala":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Kotlin":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Scala":
                                        System.out.println("¡NO!");
                                        break;
                                    case "kotlin":
                                        System.out.println("¡NO!");
                                        break;
                                    case "d":
                                        System.out.println("¡NO!");
                                        break;
                                    default:
                                        System.out.println("Número desconocido");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("¿Qué número quiere elegir?: (Del uno al nueve)");
                                var numero = sc.next();
                                switch (numero) {
                                    case "uno":
                                        System.out.println(1);
                                        break;
                                    case "dos":
                                        System.out.println(2);
                                        break;
                                    case "tres":
                                        System.out.println(3);
                                        break;
                                    case "cuatro":
                                        System.out.println(4);
                                        break;
                                    case "cinco":
                                        System.out.println(5);
                                        break;
                                    case "seis":
                                        System.out.println(6);
                                        break;
                                    case "siete":
                                        System.out.println(7);
                                        break;
                                    case "ocho":
                                        System.out.println(8);
                                        break;
                                    case "nueve":
                                        System.out.println(9);
                                        break;
                                    default:
                                        System.out.println("Numero no valido.");
                                }
                                break;
                            case 4:
                                System.out.println("¿A qué casa pertenece?: \n 1.Gryffindor \n 2.Hufflepuff \n 3.Slytherin \n 4.Ravenclaw");
                                var casaHogwarts = sc.next();
                                switch (casaHogwarts) {
                                    case "1":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "Gryffindor":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "gryffindor":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "2":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "hufflepuff":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "Hufflepuff":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "3":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "slytherin":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "Slytherin":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "4":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    case "ravenclaw":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    case "Ravenclaw":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    default:
                                        System.out.println("La casa no es valida.");
                                }
                                break;
                            case 5:
                                System.out.println("¿Donde desea ir?: (0, 1, 2, 3, 4)");
                                int direccion = sc.nextInt();
                                switch (direccion) {
                                    case 0:
                                        System.out.println("Esta en el sitio correcto, no debe moverse.");
                                        break;
                                    case 1:
                                        System.out.println("Usted tiene que subir.");
                                        break;
                                    case 2:
                                        System.out.println("Usted tiene que bajar.");
                                        break;
                                    case 3:
                                        System.out.println("Usted tiene que ir a la izquierda.");
                                        break;
                                    case 4:
                                        System.out.println("Usted tiene que ir a la derecha.");
                                        break;
                                    default:
                                        System.out.println("¡ERROR!");
                                }
                                break;
                            default:
                                System.out.println("El ejercicio " + ejerciciosSwitch + " no forma parte de la practica.");
                        }
                    } else {
                        System.out.println("El numero " + ifOrSwitch + " no es un tipo de ejercicio.");
                /* Saco un ultimo if, esta vez uso la variable j declarada al principio y que va a estar aumentando con
                 cada vuelta del bucle, y le digo que se ejecute mientras j valga menos que 5, un valor menos que la
                  condicion del for (i) que era menor o igual que 5, esto es por que no quiero que en la ultima vuelta
                  del bucle esta accion se ejecute ya que es una condición que metí para preguntar si querias que el bucle
                  se iniciara otra vez o se cortara y no tiene sentido volver a preguntarlo si el bucle se va a cortar
                  igualmente. */
                    }
                    if (j < 5) {
                        System.out.println("¿Desea realizar mas ejercicios?: \n SI o NO");
                        String x = sc.next();
                        switch (x) {
                            case "sI":             // Una vez creada una condición if que solo se repetirá hasta la
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "Si":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "SI":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "si":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "NO":            // aumentado i y j y valiendo 1 mas cada bucle.
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "nO":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "No":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "no":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            default:                               // y se salga del bucle.
                                System.out.println("No se reconocio la respuesta.");
                                i = 6;
                                break;
                        }
                    } else {
                        System.out.println("");
                    }
                }

                System.out.println("Gracias por realizar los ejercicios."); // Esto es un mensaje genérico que aparecerá una vez terminado
                // el bucle, si es que se llega a entrar, si la respuesta al primer if
                break;                               //es negativa aparecera el mensaje de abajo.
            case "Si":
        /* Hago un for para clear un bucle. Lo que hago es darle la variable i antes declarada y le digo que mientras
         i valga menos o igual a 5 ejecute las intrucciones dentro del bucle  */
                for (i = 1; i <= 5; ) {
            /* A continuacion le aumento antes de su uso tanto a i como a j (mas abajo explico j),esto es para que
            cada vez que empiece el bucle se aumente i y la repeticion del bucle sea la cantidas de veces que queramos
             en este caso 5, pero cambiando la condicion i <= 5 de for se podria aumentar o disminuir, quitando el
             aumento que hago dentro del for el bucle sera infinito. */
                    ++i;
                    ++j;
                    System.out.println("¿Sobre qué tipo de estructura quieres resolver ejercicios? \n1. if \n2. switch");
                    int ifOrSwitch = sc.nextInt();
                    if (ifOrSwitch == 1) {
                        System.out.println("Introduce el Numero de ejercicio que quieres que resuelva: \n 1. Par-impar \n 2. Sueldo anual (impuestos) \n 5. Triangulo válido \n 6.Fiesta de marmotas \n 7. Notas");
                        int ejerciciosIf = sc.nextInt();
                        switch (ejerciciosIf) {
                            case 1:
                                System.out.println("Introduzca un número: ");
                                int parImpar = sc.nextInt();
                                if (parImpar % 2 == 0) {
                                    System.out.println("El numero introducido " + parImpar + " es par.");
                                } else {
                                    System.out.println("El numero introducido " + parImpar + " es impar.");
                                }
                                break;
                            case 2:
                                System.out.println("¿Canto cobra al año?");
                                long sueldo = sc.nextInt();
                                if (sueldo <= 9_000) {
                                    System.out.println("No tienes pagar impuestos");
                                } else {
                                    System.out.println("Tienes pagar impuestos");
                                }
                                break;
                            case 5:
                                System.out.println("Introduce las medidas de los lados:");
                                System.out.println("Lado A: ");
                                int ladoA = sc.nextInt();
                                System.out.println("Lado B: ");
                                int ladoB = sc.nextInt();
                                System.out.println("Lado C: ");
                                int ladoC = sc.nextInt();
                                if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
                                    System.out.println("Si puede ser un triangulo.");
                                } else {
                                    System.out.println("No puede ser un triangulo.");
                                }
                                break;
                            case 6:
                                System.out.println("¿Cuantas tazas de mantequilla hay? : ");
                                int mantequilla = sc.nextInt();
                                System.out.println("¿Que día de la semana es? : (del 1 (Lunes) al 7 (domingo))");
                                int diaDeLaSemana = sc.nextInt();
                                if ((mantequilla >= 10 && mantequilla <= 20) && (diaDeLaSemana >= 1 && diaDeLaSemana <= 5) || (mantequilla >= 15 && mantequilla <= 25) && (diaDeLaSemana == 6 || diaDeLaSemana == 7)) {
                                    System.out.println("La fiesta sera un exito.");
                                } else {
                                    System.out.println("La fiesta no tendra exito.");
                                }
                                break;
                            case 7:
                                System.out.println("¿Que nota sacó?: ");
                                int nota = sc.nextInt();
                                switch (nota) {
                                    case 0:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 1:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 2:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 4:
                                        System.out.println("Su calificación  " + nota + " fue INS, insuficiente.");
                                        break;
                                    case 3:
                                        System.out.println("Su calificación  " + nota + " fue INS, insuficiente.");
                                        break;
                                    case 5:
                                        System.out.println("Su calificación " + nota + "  fue SUF, suficinte.");
                                        break;
                                    case 6:
                                        System.out.println("Su calificación " + nota + "  fue B, bien.");
                                        break;
                                    case 8:
                                        System.out.println("Su calificación " + nota + " fue N, notable.");
                                        break;
                                    case 7:
                                        System.out.println("Su calificación " + nota + " fue N, notable.");
                                        break;
                                    case 9:
                                        System.out.println("Su calificación " + nota + " fue SB, sobresaliente.");
                                        break;
                                    case 10:
                                        System.out.println("Su calificación " + nota + " fue SB, sobresaliente.");
                                        break;
                                    default:
                                        System.out.println("Su nota " + nota + " incorrecta.");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("El ejercicio " + ejerciciosIf + " no forma parte de la pactica.");
                                break;
                        }
                    } else if (ifOrSwitch == 2) {
                        System.out.println("Introduce el numero de ejercicio que quieres que resuelva: \n 2.Lenguajes aprendidos: \n 3.Transformar números: \n 4.Casas Hogwarts \n 5.Direcciones: ");
                        int ejerciciosSwitch = sc.nextInt();
                        switch (ejerciciosSwitch) {
                            case 2:
                                System.out.println("¿Qué lenguaje está estudiando?: \n a.Java \n b.Kotlin \n c.Scala \n d.Python");
                                var lenguajeJava = sc.next();
                                switch (lenguajeJava) {
                                    case "a":
                                        System.out.println("¡SI!");
                                        break;
                                    case "java":
                                        System.out.println("¡SI!");
                                        break;
                                    case "Java":
                                        System.out.println("¡SI!");
                                        break;
                                    case "b":
                                        System.out.println("¡NO!");
                                        break;
                                    case "c":
                                        System.out.println("¡NO!");
                                        break;
                                    case "python":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Python":
                                        System.out.println("¡NO!");
                                        break;
                                    case "scala":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Kotlin":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Scala":
                                        System.out.println("¡NO!");
                                        break;
                                    case "kotlin":
                                        System.out.println("¡NO!");
                                        break;
                                    case "d":
                                        System.out.println("¡NO!");
                                        break;
                                    default:
                                        System.out.println("Número desconocido");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("¿Qué número quiere elegir?: (Del uno al nueve)");
                                var numero = sc.next();
                                switch (numero) {
                                    case "uno":
                                        System.out.println(1);
                                        break;
                                    case "dos":
                                        System.out.println(2);
                                        break;
                                    case "tres":
                                        System.out.println(3);
                                        break;
                                    case "cuatro":
                                        System.out.println(4);
                                        break;
                                    case "cinco":
                                        System.out.println(5);
                                        break;
                                    case "seis":
                                        System.out.println(6);
                                        break;
                                    case "siete":
                                        System.out.println(7);
                                        break;
                                    case "ocho":
                                        System.out.println(8);
                                        break;
                                    case "nueve":
                                        System.out.println(9);
                                        break;
                                    default:
                                        System.out.println("Numero no valido.");
                                }
                                break;
                            case 4:
                                System.out.println("¿A qué casa pertenece?: \n 1.Gryffindor \n 2.Hufflepuff \n 3.Slytherin \n 4.Ravenclaw");
                                var casaHogwarts = sc.next();
                                switch (casaHogwarts) {
                                    case "1":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "Gryffindor":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "gryffindor":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "2":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "hufflepuff":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "Hufflepuff":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "3":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "slytherin":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "Slytherin":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "4":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    case "ravenclaw":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    case "Ravenclaw":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    default:
                                        System.out.println("La casa no es valida.");
                                }
                                break;
                            case 5:
                                System.out.println("¿Donde desea ir?: (0, 1, 2, 3, 4)");
                                int direccion = sc.nextInt();
                                switch (direccion) {
                                    case 0:
                                        System.out.println("Esta en el sitio correcto, no debe moverse.");
                                        break;
                                    case 1:
                                        System.out.println("Usted tiene que subir.");
                                        break;
                                    case 2:
                                        System.out.println("Usted tiene que bajar.");
                                        break;
                                    case 3:
                                        System.out.println("Usted tiene que ir a la izquierda.");
                                        break;
                                    case 4:
                                        System.out.println("Usted tiene que ir a la derecha.");
                                        break;
                                    default:
                                        System.out.println("¡ERROR!");
                                }
                                break;
                            default:
                                System.out.println("El ejercicio " + ejerciciosSwitch + " no forma parte de la practica.");
                        }
                    } else {
                        System.out.println("El numero " + ifOrSwitch + " no es un tipo de ejercicio.");
                /* Saco un ultimo if, esta vez uso la variable j declarada al principio y que va a estar aumentando con
                 cada vuelta del bucle, y le digo que se ejecute mientras j valga menos que 5, un valor menos que la
                  condicion del for (i) que era menor o igual que 5, esto es por que no quiero que en la ultima vuelta
                  del bucle esta accion se ejecute ya que es una condición que metí para preguntar si querias que el bucle
                  se iniciara otra vez o se cortara y no tiene sentido volver a preguntarlo si el bucle se va a cortar
                  igualmente. */
                    }
                    if (j < 5) {
                        System.out.println("¿Desea realizar mas ejercicios?: \n SI o NO");
                        String x = sc.next();
                        switch (x) {
                            case "sI":             // Una vez creada una condición if que solo se repetirá hasta la
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "Si":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "SI":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "si":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "NO":            // aumentado i y j y valiendo 1 mas cada bucle.
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "nO":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "No":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "no":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            default:                               // y se salga del bucle.
                                System.out.println("No se reconocio la respuesta.");
                                i = 6;
                                break;
                        }
                    } else {
                        System.out.println("");
                    }
                }

                System.out.println("Gracias por realizar los ejercicios."); // Esto es un mensaje genérico que aparecerá una vez terminado
                // el bucle, si es que se llega a entrar, si la respuesta al primer if
                break;                               //es negativa aparecera el mensaje de abajo.
            case "sI":
        /* Hago un for para clear un bucle. Lo que hago es darle la variable i antes declarada y le digo que mientras
         i valga menos o igual a 5 ejecute las intrucciones dentro del bucle  */
                for (i = 1; i <= 5; ) {
            /* A continuacion le aumento antes de su uso tanto a i como a j (mas abajo explico j),esto es para que
            cada vez que empiece el bucle se aumente i y la repeticion del bucle sea la cantidas de veces que queramos
             en este caso 5, pero cambiando la condicion i <= 5 de for se podria aumentar o disminuir, quitando el
             aumento que hago dentro del for el bucle sera infinito. */
                    ++i;
                    ++j;
                    System.out.println("¿Sobre qué tipo de estructura quieres resolver ejercicios? \n1. if \n2. switch");
                    int ifOrSwitch = sc.nextInt();
                    if (ifOrSwitch == 1) {
                        System.out.println("Introduce el Numero de ejercicio que quieres que resuelva: \n 1. Par-impar \n 2. Sueldo anual (impuestos) \n 5. Triangulo válido \n 6.Fiesta de marmotas \n 7. Notas");
                        int ejerciciosIf = sc.nextInt();
                        switch (ejerciciosIf) {
                            case 1:
                                System.out.println("Introduzca un número: ");
                                int parImpar = sc.nextInt();
                                if (parImpar % 2 == 0) {
                                    System.out.println("El numero introducido " + parImpar + " es par.");
                                } else {
                                    System.out.println("El numero introducido " + parImpar + " es impar.");
                                }
                                break;
                            case 2:
                                System.out.println("¿Canto cobra al año?");
                                long sueldo = sc.nextInt();
                                if (sueldo <= 9_000) {
                                    System.out.println("No tienes pagar impuestos");
                                } else {
                                    System.out.println("Tienes pagar impuestos");
                                }
                                break;
                            case 5:
                                System.out.println("Introduce las medidas de los lados:");
                                System.out.println("Lado A: ");
                                int ladoA = sc.nextInt();
                                System.out.println("Lado B: ");
                                int ladoB = sc.nextInt();
                                System.out.println("Lado C: ");
                                int ladoC = sc.nextInt();
                                if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
                                    System.out.println("Si puede ser un triangulo.");
                                } else {
                                    System.out.println("No puede ser un triangulo.");
                                }
                                break;
                            case 6:
                                System.out.println("¿Cuantas tazas de mantequilla hay? : ");
                                int mantequilla = sc.nextInt();
                                System.out.println("¿Que día de la semana es? : (del 1 (Lunes) al 7 (domingo))");
                                int diaDeLaSemana = sc.nextInt();
                                if ((mantequilla >= 10 && mantequilla <= 20) && (diaDeLaSemana >= 1 && diaDeLaSemana <= 5) || (mantequilla >= 15 && mantequilla <= 25) && (diaDeLaSemana == 6 || diaDeLaSemana == 7)) {
                                    System.out.println("La fiesta sera un exito.");
                                } else {
                                    System.out.println("La fiesta no tendra exito.");
                                }
                                break;
                            case 7:
                                System.out.println("¿Que nota sacó?: ");
                                int nota = sc.nextInt();
                                switch (nota) {
                                    case 0:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 1:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 2:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 4:
                                        System.out.println("Su calificación  " + nota + " fue INS, insuficiente.");
                                        break;
                                    case 3:
                                        System.out.println("Su calificación  " + nota + " fue INS, insuficiente.");
                                        break;
                                    case 5:
                                        System.out.println("Su calificación " + nota + "  fue SUF, suficinte.");
                                        break;
                                    case 6:
                                        System.out.println("Su calificación " + nota + "  fue B, bien.");
                                        break;
                                    case 8:
                                        System.out.println("Su calificación " + nota + " fue N, notable.");
                                        break;
                                    case 7:
                                        System.out.println("Su calificación " + nota + " fue N, notable.");
                                        break;
                                    case 9:
                                        System.out.println("Su calificación " + nota + " fue SB, sobresaliente.");
                                        break;
                                    case 10:
                                        System.out.println("Su calificación " + nota + " fue SB, sobresaliente.");
                                        break;
                                    default:
                                        System.out.println("Su nota " + nota + " incorrecta.");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("El ejercicio " + ejerciciosIf + " no forma parte de la pactica.");
                                break;
                        }
                    } else if (ifOrSwitch == 2) {
                        System.out.println("Introduce el numero de ejercicio que quieres que resuelva: \n 2.Lenguajes aprendidos: \n 3.Transformar números: \n 4.Casas Hogwarts \n 5.Direcciones: ");
                        int ejerciciosSwitch = sc.nextInt();
                        switch (ejerciciosSwitch) {
                            case 2:
                                System.out.println("¿Qué lenguaje está estudiando?: \n a.Java \n b.Kotlin \n c.Scala \n d.Python");
                                var lenguajeJava = sc.next();
                                switch (lenguajeJava) {
                                    case "a":
                                        System.out.println("¡SI!");
                                        break;
                                    case "java":
                                        System.out.println("¡SI!");
                                        break;
                                    case "Java":
                                        System.out.println("¡SI!");
                                        break;
                                    case "b":
                                        System.out.println("¡NO!");
                                        break;
                                    case "c":
                                        System.out.println("¡NO!");
                                        break;
                                    case "python":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Python":
                                        System.out.println("¡NO!");
                                        break;
                                    case "scala":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Kotlin":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Scala":
                                        System.out.println("¡NO!");
                                        break;
                                    case "kotlin":
                                        System.out.println("¡NO!");
                                        break;
                                    case "d":
                                        System.out.println("¡NO!");
                                        break;
                                    default:
                                        System.out.println("Número desconocido");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("¿Qué número quiere elegir?: (Del uno al nueve)");
                                var numero = sc.next();
                                switch (numero) {
                                    case "uno":
                                        System.out.println(1);
                                        break;
                                    case "dos":
                                        System.out.println(2);
                                        break;
                                    case "tres":
                                        System.out.println(3);
                                        break;
                                    case "cuatro":
                                        System.out.println(4);
                                        break;
                                    case "cinco":
                                        System.out.println(5);
                                        break;
                                    case "seis":
                                        System.out.println(6);
                                        break;
                                    case "siete":
                                        System.out.println(7);
                                        break;
                                    case "ocho":
                                        System.out.println(8);
                                        break;
                                    case "nueve":
                                        System.out.println(9);
                                        break;
                                    default:
                                        System.out.println("Numero no valido.");
                                }
                                break;
                            case 4:
                                System.out.println("¿A qué casa pertenece?: \n 1.Gryffindor \n 2.Hufflepuff \n 3.Slytherin \n 4.Ravenclaw");
                                var casaHogwarts = sc.next();
                                switch (casaHogwarts) {
                                    case "1":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "Gryffindor":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "gryffindor":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "2":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "hufflepuff":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "Hufflepuff":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "3":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "slytherin":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "Slytherin":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "4":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    case "ravenclaw":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    case "Ravenclaw":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    default:
                                        System.out.println("La casa no es valida.");
                                }
                                break;
                            case 5:
                                System.out.println("¿Donde desea ir?: (0, 1, 2, 3, 4)");
                                int direccion = sc.nextInt();
                                switch (direccion) {
                                    case 0:
                                        System.out.println("Esta en el sitio correcto, no debe moverse.");
                                        break;
                                    case 1:
                                        System.out.println("Usted tiene que subir.");
                                        break;
                                    case 2:
                                        System.out.println("Usted tiene que bajar.");
                                        break;
                                    case 3:
                                        System.out.println("Usted tiene que ir a la izquierda.");
                                        break;
                                    case 4:
                                        System.out.println("Usted tiene que ir a la derecha.");
                                        break;
                                    default:
                                        System.out.println("¡ERROR!");
                                }
                                break;
                            default:
                                System.out.println("El ejercicio " + ejerciciosSwitch + " no forma parte de la practica.");
                        }
                    } else {
                        System.out.println("El numero " + ifOrSwitch + " no es un tipo de ejercicio.");
                /* Saco un ultimo if, esta vez uso la variable j declarada al principio y que va a estar aumentando con
                 cada vuelta del bucle, y le digo que se ejecute mientras j valga menos que 5, un valor menos que la
                  condicion del for (i) que era menor o igual que 5, esto es por que no quiero que en la ultima vuelta
                  del bucle esta accion se ejecute ya que es una condición que metí para preguntar si querias que el bucle
                  se iniciara otra vez o se cortara y no tiene sentido volver a preguntarlo si el bucle se va a cortar
                  igualmente. */
                    }
                    if (j < 5) {
                        System.out.println("¿Desea realizar mas ejercicios?: \n SI o NO");
                        String x = sc.next();
                        switch (x) {
                            case "sI":             // Una vez creada una condición if que solo se repetirá hasta la
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "Si":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "SI":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "si":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "NO":            // aumentado i y j y valiendo 1 mas cada bucle.
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "nO":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "No":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "no":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            default:                               // y se salga del bucle.
                                System.out.println("No se reconocio la respuesta.");
                                i = 6;
                                break;
                        }
                    } else {
                        System.out.println("");
                    }
                }

                System.out.println("Gracias por realizar los ejercicios."); // Esto es un mensaje genérico que aparecerá una vez terminado
                // el bucle, si es que se llega a entrar, si la respuesta al primer if
                break;                               //es negativa aparecera el mensaje de abajo.
            case "si":
        /* Hago un for para clear un bucle. Lo que hago es darle la variable i antes declarada y le digo que mientras
         i valga menos o igual a 5 ejecute las intrucciones dentro del bucle  */
                for (i = 1; i <= 5; ) {
            /* A continuacion le aumento antes de su uso tanto a i como a j (mas abajo explico j),esto es para que
            cada vez que empiece el bucle se aumente i y la repeticion del bucle sea la cantidas de veces que queramos
             en este caso 5, pero cambiando la condicion i <= 5 de for se podria aumentar o disminuir, quitando el
             aumento que hago dentro del for el bucle sera infinito. */
                    ++i;
                    ++j;
                    System.out.println("¿Sobre qué tipo de estructura quieres resolver ejercicios? \n1. if \n2. switch");
                    int ifOrSwitch = sc.nextInt();
                    if (ifOrSwitch == 1) {
                        System.out.println("Introduce el Numero de ejercicio que quieres que resuelva: \n 1. Par-impar \n 2. Sueldo anual (impuestos) \n 5. Triangulo válido \n 6.Fiesta de marmotas \n 7. Notas");
                        int ejerciciosIf = sc.nextInt();
                        switch (ejerciciosIf) {
                            case 1:
                                System.out.println("Introduzca un número: ");
                                int parImpar = sc.nextInt();
                                if (parImpar % 2 == 0) {
                                    System.out.println("El numero introducido " + parImpar + " es par.");
                                } else {
                                    System.out.println("El numero introducido " + parImpar + " es impar.");
                                }
                                break;
                            case 2:
                                System.out.println("¿Canto cobra al año?");
                                long sueldo = sc.nextInt();
                                if (sueldo <= 9_000) {
                                    System.out.println("No tienes pagar impuestos");
                                } else {
                                    System.out.println("Tienes pagar impuestos");
                                }
                                break;
                            case 5:
                                System.out.println("Introduce las medidas de los lados:");
                                System.out.println("Lado A: ");
                                int ladoA = sc.nextInt();
                                System.out.println("Lado B: ");
                                int ladoB = sc.nextInt();
                                System.out.println("Lado C: ");
                                int ladoC = sc.nextInt();
                                if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
                                    System.out.println("Si puede ser un triangulo.");
                                } else {
                                    System.out.println("No puede ser un triangulo.");
                                }
                                break;
                            case 6:
                                System.out.println("¿Cuantas tazas de mantequilla hay? : ");
                                int mantequilla = sc.nextInt();
                                System.out.println("¿Que día de la semana es? : (del 1 (Lunes) al 7 (domingo))");
                                int diaDeLaSemana = sc.nextInt();
                                if ((mantequilla >= 10 && mantequilla <= 20) && (diaDeLaSemana >= 1 && diaDeLaSemana <= 5) || (mantequilla >= 15 && mantequilla <= 25) && (diaDeLaSemana == 6 || diaDeLaSemana == 7)) {
                                    System.out.println("La fiesta sera un exito.");
                                } else {
                                    System.out.println("La fiesta no tendra exito.");
                                }
                                break;
                            case 7:
                                System.out.println("¿Que nota sacó?: ");
                                int nota = sc.nextInt();
                                switch (nota) {
                                    case 0:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 1:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 2:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 4:
                                        System.out.println("Su calificación  " + nota + " fue INS, insuficiente.");
                                        break;
                                    case 3:
                                        System.out.println("Su calificación  " + nota + " fue INS, insuficiente.");
                                        break;
                                    case 5:
                                        System.out.println("Su calificación " + nota + "  fue SUF, suficinte.");
                                        break;
                                    case 6:
                                        System.out.println("Su calificación " + nota + "  fue B, bien.");
                                        break;
                                    case 8:
                                        System.out.println("Su calificación " + nota + " fue N, notable.");
                                        break;
                                    case 7:
                                        System.out.println("Su calificación " + nota + " fue N, notable.");
                                        break;
                                    case 9:
                                        System.out.println("Su calificación " + nota + " fue SB, sobresaliente.");
                                        break;
                                    case 10:
                                        System.out.println("Su calificación " + nota + " fue SB, sobresaliente.");
                                        break;
                                    default:
                                        System.out.println("Su nota " + nota + " incorrecta.");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("El ejercicio " + ejerciciosIf + " no forma parte de la pactica.");
                                break;
                        }
                    } else if (ifOrSwitch == 2) {
                        System.out.println("Introduce el numero de ejercicio que quieres que resuelva: \n 2.Lenguajes aprendidos: \n 3.Transformar números: \n 4.Casas Hogwarts \n 5.Direcciones: ");
                        int ejerciciosSwitch = sc.nextInt();
                        switch (ejerciciosSwitch) {
                            case 2:
                                System.out.println("¿Qué lenguaje está estudiando?: \n a.Java \n b.Kotlin \n c.Scala \n d.Python");
                                var lenguajeJava = sc.next();
                                switch (lenguajeJava) {
                                    case "a":
                                        System.out.println("¡SI!");
                                        break;
                                    case "java":
                                        System.out.println("¡SI!");
                                        break;
                                    case "Java":
                                        System.out.println("¡SI!");
                                        break;
                                    case "b":
                                        System.out.println("¡NO!");
                                        break;
                                    case "c":
                                        System.out.println("¡NO!");
                                        break;
                                    case "python":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Python":
                                        System.out.println("¡NO!");
                                        break;
                                    case "scala":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Kotlin":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Scala":
                                        System.out.println("¡NO!");
                                        break;
                                    case "kotlin":
                                        System.out.println("¡NO!");
                                        break;
                                    case "d":
                                        System.out.println("¡NO!");
                                        break;
                                    default:
                                        System.out.println("Número desconocido");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("¿Qué número quiere elegir?: (Del uno al nueve)");
                                var numero = sc.next();
                                switch (numero) {
                                    case "uno":
                                        System.out.println(1);
                                        break;
                                    case "dos":
                                        System.out.println(2);
                                        break;
                                    case "tres":
                                        System.out.println(3);
                                        break;
                                    case "cuatro":
                                        System.out.println(4);
                                        break;
                                    case "cinco":
                                        System.out.println(5);
                                        break;
                                    case "seis":
                                        System.out.println(6);
                                        break;
                                    case "siete":
                                        System.out.println(7);
                                        break;
                                    case "ocho":
                                        System.out.println(8);
                                        break;
                                    case "nueve":
                                        System.out.println(9);
                                        break;
                                    default:
                                        System.out.println("Numero no valido.");
                                }
                                break;
                            case 4:
                                System.out.println("¿A qué casa pertenece?: \n 1.Gryffindor \n 2.Hufflepuff \n 3.Slytherin \n 4.Ravenclaw");
                                var casaHogwarts = sc.next();
                                switch (casaHogwarts) {
                                    case "1":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "Gryffindor":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "gryffindor":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "2":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "hufflepuff":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "Hufflepuff":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "3":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "slytherin":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "Slytherin":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "4":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    case "ravenclaw":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    case "Ravenclaw":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    default:
                                        System.out.println("La casa no es valida.");
                                }
                                break;
                            case 5:
                                System.out.println("¿Donde desea ir?: (0, 1, 2, 3, 4)");
                                int direccion = sc.nextInt();
                                switch (direccion) {
                                    case 0:
                                        System.out.println("Esta en el sitio correcto, no debe moverse.");
                                        break;
                                    case 1:
                                        System.out.println("Usted tiene que subir.");
                                        break;
                                    case 2:
                                        System.out.println("Usted tiene que bajar.");
                                        break;
                                    case 3:
                                        System.out.println("Usted tiene que ir a la izquierda.");
                                        break;
                                    case 4:
                                        System.out.println("Usted tiene que ir a la derecha.");
                                        break;
                                    default:
                                        System.out.println("¡ERROR!");
                                }
                                break;
                            default:
                                System.out.println("El ejercicio " + ejerciciosSwitch + " no forma parte de la practica.");
                        }
                    } else {
                        System.out.println("El numero " + ifOrSwitch + " no es un tipo de ejercicio.");
                /* Saco un ultimo if, esta vez uso la variable j declarada al principio y que va a estar aumentando con
                 cada vuelta del bucle, y le digo que se ejecute mientras j valga menos que 5, un valor menos que la
                  condicion del for (i) que era menor o igual que 5, esto es por que no quiero que en la ultima vuelta
                  del bucle esta accion se ejecute ya que es una condición que metí para preguntar si querias que el bucle
                  se iniciara otra vez o se cortara y no tiene sentido volver a preguntarlo si el bucle se va a cortar
                  igualmente. */
                    }
                    if (j < 5) {
                        System.out.println("¿Desea realizar mas ejercicios?: \n SI o NO");
                        String x = sc.next();
                        switch (x) {
                            case "sI":             // Una vez creada una condición if que solo se repetirá hasta la
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "Si":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "SI":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "si":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "NO":            // aumentado i y j y valiendo 1 mas cada bucle.
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "nO":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "No":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "no":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            default:                               // y se salga del bucle.
                                System.out.println("No se reconocio la respuesta.");
                                i = 6;
                                break;
                        }
                    } else {
                        System.out.println("");
                    }
                }

                System.out.println("Gracias por realizar los ejercicios."); // Esto es un mensaje genérico que aparecerá una vez terminado
                // el bucle, si es que se llega a entrar, si la respuesta al primer if
                break;                               //es negativa aparecera el mensaje de abajo.
            case "SI":
        /* Hago un for para clear un bucle. Lo que hago es darle la variable i antes declarada y le digo que mientras
         i valga menos o igual a 5 ejecute las intrucciones dentro del bucle  */
                for (i = 1; i <= 5; ) {
            /* A continuacion le aumento antes de su uso tanto a i como a j (mas abajo explico j),esto es para que
            cada vez que empiece el bucle se aumente i y la repeticion del bucle sea la cantidas de veces que queramos
             en este caso 5, pero cambiando la condicion i <= 5 de for se podria aumentar o disminuir, quitando el
             aumento que hago dentro del for el bucle sera infinito. */
                    ++i;
                    ++j;
                    System.out.println("¿Sobre qué tipo de estructura quieres resolver ejercicios? \n1. if \n2. switch");
                    int ifOrSwitch = sc.nextInt();
                    if (ifOrSwitch == 1) {
                        System.out.println("Introduce el Numero de ejercicio que quieres que resuelva: \n 1. Par-impar \n 2. Sueldo anual (impuestos) \n 5. Triangulo válido \n 6.Fiesta de marmotas \n 7. Notas");
                        int ejerciciosIf = sc.nextInt();
                        switch (ejerciciosIf) {
                            case 1:
                                System.out.println("Introduzca un número: ");
                                int parImpar = sc.nextInt();
                                if (parImpar % 2 == 0) {
                                    System.out.println("El numero introducido " + parImpar + " es par.");
                                } else {
                                    System.out.println("El numero introducido " + parImpar + " es impar.");
                                }
                                break;
                            case 2:
                                System.out.println("¿Canto cobra al año?");
                                long sueldo = sc.nextInt();
                                if (sueldo <= 9_000) {
                                    System.out.println("No tienes pagar impuestos");
                                } else {
                                    System.out.println("Tienes pagar impuestos");
                                }
                                break;
                            case 5:
                                System.out.println("Introduce las medidas de los lados:");
                                System.out.println("Lado A: ");
                                int ladoA = sc.nextInt();
                                System.out.println("Lado B: ");
                                int ladoB = sc.nextInt();
                                System.out.println("Lado C: ");
                                int ladoC = sc.nextInt();
                                if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
                                    System.out.println("Si puede ser un triangulo.");
                                } else {
                                    System.out.println("No puede ser un triangulo.");
                                }
                                break;
                            case 6:
                                System.out.println("¿Cuantas tazas de mantequilla hay? : ");
                                int mantequilla = sc.nextInt();
                                System.out.println("¿Que día de la semana es? : (del 1 (Lunes) al 7 (domingo))");
                                int diaDeLaSemana = sc.nextInt();
                                if ((mantequilla >= 10 && mantequilla <= 20) && (diaDeLaSemana >= 1 && diaDeLaSemana <= 5) || (mantequilla >= 15 && mantequilla <= 25) && (diaDeLaSemana == 6 || diaDeLaSemana == 7)) {
                                    System.out.println("La fiesta sera un exito.");
                                } else {
                                    System.out.println("La fiesta no tendra exito.");
                                }
                                break;
                            case 7:
                                System.out.println("¿Que nota sacó?: ");
                                int nota = sc.nextInt();
                                switch (nota) {
                                    case 0:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 1:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 2:
                                        System.out.println("Su calificación " + nota + "  fue MD, muy deficiente.");
                                        break;
                                    case 4:
                                        System.out.println("Su calificación  " + nota + " fue INS, insuficiente.");
                                        break;
                                    case 3:
                                        System.out.println("Su calificación  " + nota + " fue INS, insuficiente.");
                                        break;
                                    case 5:
                                        System.out.println("Su calificación " + nota + "  fue SUF, suficinte.");
                                        break;
                                    case 6:
                                        System.out.println("Su calificación " + nota + "  fue B, bien.");
                                        break;
                                    case 8:
                                        System.out.println("Su calificación " + nota + " fue N, notable.");
                                        break;
                                    case 7:
                                        System.out.println("Su calificación " + nota + " fue N, notable.");
                                        break;
                                    case 9:
                                        System.out.println("Su calificación " + nota + " fue SB, sobresaliente.");
                                        break;
                                    case 10:
                                        System.out.println("Su calificación " + nota + " fue SB, sobresaliente.");
                                        break;
                                    default:
                                        System.out.println("Su nota " + nota + " incorrecta.");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("El ejercicio " + ejerciciosIf + " no forma parte de la pactica.");
                                break;
                        }
                    } else if (ifOrSwitch == 2) {
                        System.out.println("Introduce el numero de ejercicio que quieres que resuelva: \n 2.Lenguajes aprendidos: \n 3.Transformar números: \n 4.Casas Hogwarts \n 5.Direcciones: ");
                        int ejerciciosSwitch = sc.nextInt();
                        switch (ejerciciosSwitch) {
                            case 2:
                                System.out.println("¿Qué lenguaje está estudiando?: \n a.Java \n b.Kotlin \n c.Scala \n d.Python");
                                var lenguajeJava = sc.next();
                                switch (lenguajeJava) {
                                    case "a":
                                        System.out.println("¡SI!");
                                        break;
                                    case "java":
                                        System.out.println("¡SI!");
                                        break;
                                    case "Java":
                                        System.out.println("¡SI!");
                                        break;
                                    case "b":
                                        System.out.println("¡NO!");
                                        break;
                                    case "c":
                                        System.out.println("¡NO!");
                                        break;
                                    case "python":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Python":
                                        System.out.println("¡NO!");
                                        break;
                                    case "scala":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Kotlin":
                                        System.out.println("¡NO!");
                                        break;
                                    case "Scala":
                                        System.out.println("¡NO!");
                                        break;
                                    case "kotlin":
                                        System.out.println("¡NO!");
                                        break;
                                    case "d":
                                        System.out.println("¡NO!");
                                        break;
                                    default:
                                        System.out.println("Número desconocido");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("¿Qué número quiere elegir?: (Del uno al nueve)");
                                var numero = sc.next();
                                switch (numero) {
                                    case "uno":
                                        System.out.println(1);
                                        break;
                                    case "dos":
                                        System.out.println(2);
                                        break;
                                    case "tres":
                                        System.out.println(3);
                                        break;
                                    case "cuatro":
                                        System.out.println(4);
                                        break;
                                    case "cinco":
                                        System.out.println(5);
                                        break;
                                    case "seis":
                                        System.out.println(6);
                                        break;
                                    case "siete":
                                        System.out.println(7);
                                        break;
                                    case "ocho":
                                        System.out.println(8);
                                        break;
                                    case "nueve":
                                        System.out.println(9);
                                        break;
                                    default:
                                        System.out.println("Numero no valido.");
                                }
                                break;
                            case 4:
                                System.out.println("¿A qué casa pertenece?: \n 1.Gryffindor \n 2.Hufflepuff \n 3.Slytherin \n 4.Ravenclaw");
                                var casaHogwarts = sc.next();
                                switch (casaHogwarts) {
                                    case "1":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "Gryffindor":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "gryffindor":
                                        System.out.println("Los Gryffindor destacan por su valentia.");
                                        break;
                                    case "2":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "hufflepuff":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "Hufflepuff":
                                        System.out.println("Los Hufflepuff destacan por su lealtad.");
                                        break;
                                    case "3":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "slytherin":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "Slytherin":
                                        System.out.println("Los Slytherin destacan por su asctucia.");
                                        break;
                                    case "4":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    case "ravenclaw":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    case "Ravenclaw":
                                        System.out.println("Los Ravenclaw destacan por su intelecto.");
                                        break;
                                    default:
                                        System.out.println("La casa no es valida.");
                                }
                                break;
                            case 5:
                                System.out.println("¿Donde desea ir?: (0, 1, 2, 3, 4)");
                                int direccion = sc.nextInt();
                                switch (direccion) {
                                    case 0:
                                        System.out.println("Esta en el sitio correcto, no debe moverse.");
                                        break;
                                    case 1:
                                        System.out.println("Usted tiene que subir.");
                                        break;
                                    case 2:
                                        System.out.println("Usted tiene que bajar.");
                                        break;
                                    case 3:
                                        System.out.println("Usted tiene que ir a la izquierda.");
                                        break;
                                    case 4:
                                        System.out.println("Usted tiene que ir a la derecha.");
                                        break;
                                    default:
                                        System.out.println("¡ERROR!");
                                }
                                break;
                            default:
                                System.out.println("El ejercicio " + ejerciciosSwitch + " no forma parte de la practica.");
                        }
                    } else {
                        System.out.println("El numero " + ifOrSwitch + " no es un tipo de ejercicio.");
                /* Saco un ultimo if, esta vez uso la variable j declarada al principio y que va a estar aumentando con
                 cada vuelta del bucle, y le digo que se ejecute mientras j valga menos que 5, un valor menos que la
                  condicion del for (i) que era menor o igual que 5, esto es por que no quiero que en la ultima vuelta
                  del bucle esta accion se ejecute ya que es una condición que metí para preguntar si querias que el bucle
                  se iniciara otra vez o se cortara y no tiene sentido volver a preguntarlo si el bucle se va a cortar
                  igualmente. */
                    }
                    if (j < 5) {
                        System.out.println("¿Desea realizar mas ejercicios?: \n SI o NO");
                        String x = sc.next();
                        switch (x) {
                            case "sI":             // Una vez creada una condición if que solo se repetirá hasta la
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "Si":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "SI":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "si":
                                System.out.println("REINICIANDO");  // penultima vuelta del bucle hago un pregunta sobre si se quiere repetir
                                break;                              // los ejercicios, si la respuesta es afirmativa el bucle se repetira
                            case "NO":            // aumentado i y j y valiendo 1 mas cada bucle.
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "nO":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "No":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            case "no":
                                System.out.println("ADIOS");        // En caso negativo o de una respuesta no valida (son casos distintos
                                i = 6;                            // porque queremos darle una respuesta distinta) se le dara a
                                break;                             // i el valor de 6 para que no se cumpla la condifición del for
                            default:                               // y se salga del bucle.
                                System.out.println("No se reconocio la respuesta.");
                                i = 6;
                                break;
                        }
                    } else {
                        System.out.println("");
                    }
                }

                System.out.println("Gracias por realizar los ejercicios."); // Esto es un mensaje genérico que aparecerá una vez terminado
                // el bucle, si es que se llega a entrar, si la respuesta al primer if
                break;                               //es negativa aparecera el mensaje de abajo.
            default:
                System.out.println("Esta bien, en otro momento sera :(");
        }
    }
}
