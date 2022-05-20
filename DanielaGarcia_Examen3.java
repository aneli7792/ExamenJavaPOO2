import java.util.Arrays;

public class DanielaGarcia_Examen3 {

    public static void main(String[] args) {
        int arreglo1[] = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        int arreglo2[] = {1, 1, 2, 2, 1, 1, 1, 2, 1};
        System.out.println("Arreglo : " + Arrays.toString(Arrays.stream(arreglo1).toArray()));
        System.out.println("---------------------------------------------------------------");
        System.out.println("Arreglo 2 : " + Arrays.toString(Arrays.stream(arreglo2).toArray()));
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("---------------------------------------------------------------");
            System.out.println(arreglo1[i] + " + " + arreglo2[i] + " = " + (arreglo1[i] + arreglo2[i]));
            System.out.println(arreglo1[i] + " * " + arreglo2[i] + " = " + arreglo1[i] * arreglo2[i]);
        }
    }
}
