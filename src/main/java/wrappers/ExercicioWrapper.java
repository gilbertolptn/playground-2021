package wrappers;

public class ExercicioWrapper {

    public static void main(String[] args) {

        int[] numeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
                115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97,
                111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97,
                33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115,
                32, 100, 101, 109, 97, 105, 115, 32, 58, 41};

        System.out.println("Forma 1:");
        forma1(numeros);
        System.out.println("\nForma 2:");
        forma2(numeros);
        System.out.println("\nForma 3:");
        forma3(numeros);
        System.out.println("\nForma 4:");
        forma4(numeros);

    }

    private static void forma1(int[] numeros) {
        for (int numero : numeros){
            System.out.print(Character.toChars(numero));
        }
    }

    private static void forma2(int[] numeros) {
        for (int numero : numeros){
            char letra = (char) numero;
            System.out.print(letra);
        }
    }

    private static void forma3(int[] numeros) {
        for (int numero : numeros){
            System.out.print(Character.toString(numero));
        }
    }

    private static void forma4(int[] numeros) {
        for (int i=0; i< numeros.length;i++){
            System.out.print((char) numeros[i]);
        }
    }

}
