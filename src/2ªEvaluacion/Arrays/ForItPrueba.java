package Arrays;


public class ForItPrueba {

    public static void main(String []args){
 String [] paises = new String[8];

 paises [0] = "España";
    paises [1] = "México";
    paises [2] = "Colombia";
    paises [3] = "Peru";
    paises [4] = "Chile";
    paises [5] = "Argentina";
    paises [6] = "Ecuador";
    paises [7] = "Venezuela";

    for (int i = 0; i < paises.length; i++){
        System.out.println("Pais " + (i +1) + " " + paises[i]);
    }
        for(String y:paises) {
            System.out.println("País " + y);
        }


    System.out.println("---------------------------");

String [] paises2 = {"España","Peru","México","Colombia","Argentina","Ecuador","Venezuela"};
        for(String y:paises2) {
            System.out.println("País " + y);
        }

        System.out.println("---------------------------");
    


}
}
