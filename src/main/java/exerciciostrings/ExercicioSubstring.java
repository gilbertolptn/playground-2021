package exerciciostrings;

import java.util.Scanner;

public class ExercicioSubstring {
    public static void main(String[] args) {

        System.out.println("Informe um texto:");
        String texto = new Scanner(System.in).nextLine();

        if(texto.length() <= 13){
            System.out.println(texto);
        }else{
            System.out.println(texto.substring(0, 13));
        }

    }
}
