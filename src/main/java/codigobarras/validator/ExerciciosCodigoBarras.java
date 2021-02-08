package codigobarras.validator;

import java.util.Scanner;

public class ExerciciosCodigoBarras {

    public static void main(String[] args) {
        //20 + 2 (digitos verificadores)
        //soma 20 = 2 digitos verificados
        //0000000000000000000101 = 00000000000000000001-01 -> 00000+1=1 digito verificador 01
        //0000000000000000022206 = 00000000000000000222-06 -> 2+2+2=6 digito verificador 06
        int[] codigoBarras = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,0,6};

        //System.out.println("" + codigoBarras[0] + codigoBarras[1]); //Para imprimir os números sem somar

        int soma = 36;

        //System.out.println("Valores" + soma + soma%10 );

        //codigoBarras[20] == soma/1 && codigoBarras[21] == soma%10;

        char[] entrada = new Scanner(System.in).nextLine().toCharArray();

        int[] codigoBarrasNovo = new int[22];
        for (int i = 0; i < entrada.length; i++) {
            codigoBarrasNovo[ i ] = Integer.parseInt(String.valueOf(entrada[ i ]));
        }

        System.out.println(codigoBarrasNovo[0]);

    }


}
