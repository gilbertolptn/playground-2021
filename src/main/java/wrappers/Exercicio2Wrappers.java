package wrappers;

public class Exercicio2Wrappers {

    public static void main(String[] args) {

        /*
        Crie uma função que recebe uma classe Character (pressupondo que seja uma letra maiúscula)
        e converta a mesma para minúscula.
         */
        String letraC = converteEmMinuscula('C');
        System.out.println(letraC);

        String letraD = converteEmMinuscula(Character.valueOf('D'));
        System.out.println(letraD);
    }

    public static String converteEmMinuscula(Character letra){
        return "";//???? Não vale: String.toLowerCase()
    }
}
