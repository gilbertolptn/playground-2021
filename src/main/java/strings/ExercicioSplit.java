package strings;

import java.util.Scanner;

public class ExercicioSplit {
    public static void main(String[] args) {

        System.out.println("Informe um texto:");
        String texto = new Scanner(System.in).nextLine();

        String[] partes = texto.split(" ");

        for (String palavra : partes){
            System.out.println(palavra);
        }


    }
}
