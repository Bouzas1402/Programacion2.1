package POO.Apuntes.ApuntesClases;

public class Main2 {
    public static void main(String[] args){
        String x = "wall_e";
        String y = "DM224";
        Robot robot1 = new Robot();
        Robot robot2 = new Robot(x,y);
        System.out.println("Nombre de robot 1 : " + robot1.nombre + "\nModelo: " + robot1.modelo + "\nNombre de robot 2 : "
        + robot2.nombre + "\nModelo: " + robot2.modelo);
    }
}
