package comandos;

public class ExercicioMenorNumero {

    public static void main(String[] args) {

        int[] numeros = {88, 7, 0, -1, 45, 3, 92, -9, 30000001, 12, 23567};

        int menorValor = numeros[0];

        for (int valor : numeros){
            if(valor < menorValor){
                menorValor = valor;
            }
        }
        System.out.println("Menor valor: " + menorValor);

    }
}
