package codigobarras.validator;

import java.util.Scanner;

/*
- Lançamos um novo tipo de código de barras composto de 22 dígitos
- Os 20 números primeiros números são a numeração definida pelo estabelecimento e os 2 restantes são os dígitos verificadores.
- Os dígitos verificadores são compostos da soma dos 20 primeiros números.
- Caso a soma ultrapasse 99, ou seja, use mais de 2 casas, são consideradas somente as duas últimas casas.
*/
public class CodigoBarrasValidatorArrayOrganizado {

    public static void main(String[] args) {

        //Inválidos
        //2135785552341234567843
        //int[] codigoBarras = {2,1,3,5,7,8,5,5,5,2,3,4,1,2,3,4,5,6,7,8,4,3};// Deveria ser 86
        //int[] codigoBarras = {4,2,4,2,3,4,2,3,4,2,3,4,2,4,2,3,4,2,3,4,2,3};//Digito 61 - invalido
        //int[] codigoBarras = {1,2,7,9,1,9};//Menor tamanho - inválido

        //Válidos
        //2135785552341234567886
        //int[] codigoBarras = {2,1,3,5,7,8,5,5,5,2,3,4,1,2,3,4,5,6,7,8,8,6};
        //9889997999899989797970
        //int[] codigoBarras = {9,8,8,9,9,9,7,9,9,9,8,9,9,9,8,9,7,9,7,9,7,0};//Digito 170

        //Perguntar
        int[] codigoBarras = perguntaCodigoDeBarras();
        boolean valido = validaCodigoBarras(codigoBarras);

        if(valido){
            System.out.println("* Código de Barras válido!");
        }else{
            System.err.println("* Código de Barras inválido!");
        }
    }

    private static int[] perguntaCodigoDeBarras() {
        System.out.println("Informe o código de barras:");
        char[] entrada = new Scanner(System.in).nextLine().toCharArray();

        int[] codigoBarrasNovo = new int[22];
        for (int i = 0; i < entrada.length; i++) {
            codigoBarrasNovo[ i ] = Character.getNumericValue(entrada[i]);
        }

        return codigoBarrasNovo;
    }

    public static boolean validaCodigoBarras(int[] codigoBarras){

        if(codigoBarras.length != 22){
            System.err.println("* Tamanho deve ser igual a 22!");
            return false;
        }

        int[] digitosExtraidos = extraiDigitoVerificador(codigoBarras);
        int[] digitoCalculado = calculaDigitoVerificador(codigoBarras);

        return digitoCalculado[0] == digitosExtraidos[0] &&
                digitoCalculado[1] == digitosExtraidos[1];
    }

    public static int[] extraiDigitoVerificador(int[] codigoBarras){
        int[] digitos = new int[]{codigoBarras[20], codigoBarras[21]};
        System.out.println(" -> Dígito verificador original: " + codigoBarras[20] + codigoBarras[21]);
        return digitos;
    }

    public static int[] calculaDigitoVerificador(int[] codigoBarras){

        int soma = 0;
        for (int i = 0; i < 20; i++) {
            soma += codigoBarras[i];
        }
        System.out.println(" -> Soma: "+ soma);

        //MOD10 - se 1, fica 1. Se 23 fica 3. Se 227 fica 7.
        int unidade = soma % 10;

        // Divisão/10 para pegar o decimal e o MOD10 é para resolver o > 99
        int decimal = (soma/10) % 10;

        System.out.println(" -> Digito verificador calculado: "+ decimal + unidade);

        //int[] digito = new int[]{ decimal, unidade};
        //return digito;
        return new int[]{ decimal, unidade};
    }

}
