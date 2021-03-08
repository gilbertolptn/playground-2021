package strings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ExercicioFuncionarios {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(Path.of("src/main/resources/pessoas.csv"));

        boolean temNovaLinha = sc.hasNext();//Serve pra saber se há nova linha
        String linha = sc.nextLine(); // Troca e retorna a nova linha
        System.out.println(linha);
    }
}
