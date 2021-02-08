package exerciciostrings;

public class ExercicioUpperLower {
    public static void main(String[] args) {

        //Transforme a primeira palavra em Maiúsculas e as demais em minúsculas.

        exemploSabendoAFrase();
        exemploComBoolean();
        exemploComInteiro();
        exemploComIndexOf();
    }

    private static void exemploComIndexOf() {
        String entrada =  "Em terra de cego quem tem um olho é rei";
        int posicaoPrimeiroEspaco = entrada.indexOf(" ");

        String primeira = entrada.substring(0, posicaoPrimeiroEspaco);
        String restante = entrada.substring(posicaoPrimeiroEspaco);//Até o final

        System.out.println(primeira.toUpperCase() + restante.toLowerCase());

        /*int lengthComplexo = "texto".substring(2)
                .toUpperCase()
                .split(".").length;*/
    }

    private static void exemploComInteiro() {
        String entrada =  "Em terra de cego quem tem um olho é rei";
        String[] palavras = entrada.split(" ");

        int posicao = 1;

        for (String palavra : palavras){
            if(posicao == 1){
                System.out.print(palavra.toUpperCase() + " ");
            }else{
                System.out.print(palavra.toLowerCase() + " ");
            }

            posicao++; //posicao = posicao+1
        }
    }

    private static void exemploComBoolean() {
        String entrada =  "Em terra de cego quem tem um olho é rei";
        String[] palavras = entrada.split(" ");

        boolean ehAPrimeira = true;

        for (String palavra : palavras){

            if(ehAPrimeira){
                System.out.print(palavra.toUpperCase() + " ");
                ehAPrimeira = false;
                continue;
            }

            System.out.print(palavra.toLowerCase() + " ");
        }
    }

    private static void exemploSabendoAFrase() {
        String entrada =  "Pimenta nos Olhos dos Outros é Refresco";

        String primeiraPalavra = entrada.substring(0, 8);
        String restanteDaFrase = entrada.substring(9);
        String transformada = primeiraPalavra.toUpperCase() + restanteDaFrase.toLowerCase();

        System.out.println(transformada);
    }
}
