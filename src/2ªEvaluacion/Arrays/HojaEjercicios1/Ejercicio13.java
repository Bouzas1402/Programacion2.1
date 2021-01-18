package Arrays.HojaEjercicios1;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //De una empresa de transporte se quiere guardar el nombre de los conductores que tiene, y
        //los kilómetros que conducen cada día de la semana.
        //Para guardar esta información se van a utilizar dos arreglos:
        //• Nombre: Lista para guardar los nombres de los conductores.
        //• kms: Tabla para guardar los kilómetros que realizan cada día de la semana.
        //Se quiere generar una nueva lista (“total_kms”) con los kilómetros totales que realiza cada
        //conductor.
        //Al finalizar se muestra la lista con los nombres de conductores y los kilómetros que ha
        //realizado.
        String [] conductor = new String[5];
        int [][] kmsDia = new int[5][7];
        int [] KmsTotales = new int[5];
        for (int i = 0; i < conductor.length; i++) {
System.out.println("Introduce un conductor:");
conductor [i] = sc.nextLine();
System.out.println("Introduce los KM que hace cada dia (7 dias de la semana):");
            for (int j = 0; j < kmsDia[i].length; j++) {
kmsDia [i][j] = sc.nextInt();
sc.nextLine();
KmsTotales[i]+= kmsDia[i][j];
            }
        }
        System.out.println(Arrays.toString(conductor));
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(kmsDia[i]));
        }
        System.out.println(Arrays.toString(KmsTotales));
    }
}
