package Arrays;
public class ForItPrueba3 {
    public static void main(String[] args) {
int [] aleatorios = new int[150];
for (int i = 0; i < aleatorios.length; i++) {
    aleatorios [i] = (int) (Math.random() * 100 + 1);
}
for(int y:aleatorios) {
System.out.print(y + " ");
}
    }
}
