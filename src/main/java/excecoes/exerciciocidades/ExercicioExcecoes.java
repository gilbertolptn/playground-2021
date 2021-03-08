package excecoes.exerciciocidades;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExercicioExcecoes {
    //Constante
    private static final List<String> CIDADES = Arrays.asList(
                                                    "Porto Alegre", "Curitiba",
                                                    "São Paulo", "Rio de Janeiro",
                                                    "Cuiabá", "São Luís.", "Canoas");

    public static void main(String[] args) {
        System.out.printf("Informe a posição de uma das cidades [1-%d]: \n", CIDADES.size());
        int posicao = pedePosicaoAteInformadoCorreto();
        String nomeCidade = CIDADES.get(posicao-1);
        System.out.println("Você escolheu: " + nomeCidade);
    }

    private static Integer pedePosicaoAteInformadoCorreto() {
        while (true) {
            try {
                return pedePosicao();
            } catch (PosicaoInvalidaException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static int pedePosicao() throws PosicaoInvalidaException {
        try(Scanner scanner = new Scanner(System.in)) {
            int posicao = scanner.nextInt();

            if (posicao <= 0 || posicao > CIDADES.size()) {
                String message = String.format("Opção inválida, informe uma opção de 1 a %d", CIDADES.size());
                throw new PosicaoInvalidaException(message);
            }
            return posicao;
        }
    }
}
