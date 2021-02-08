package wrappers;

import java.util.List;

public class ExemplosWrappers {
    public static void main(String[] args) {

        //nullVsVazio();

//        soComPrimitivos();

        //nullEmTiposDiferentes();
    }

    private static void nullEmTiposDiferentes() {
        //Diferença entre Primitivo e Wrapper Classes quanto ao NULL
        float salario = 0;//PRIMITIVO NUNCA fica NULO
        Float beneficios = null;//REFERENCIA, pode ficar NULO

        System.out.println(salario);
        System.out.println(beneficios);
    }

    private static void nullVsVazio() {
        //Null VS Vazio
        String a = "aa";//Instanciado com conteúdo
        String b = "";//Vazio, foi instanciado, mas não tem conteúdo
        String c;//Null (implicito) - não foi instanciada
        String d = null;//Null (explicito) - não foi instanciada
    }

    private static void soComPrimitivos() {
        int[] lista = new int[1];
        lista[0] = 25;
        int primeiroNumero = lista[0];
    }

    private static void soComWrapper() {
        Integer[] lista = new Integer[1];
        lista[0] = Integer.valueOf(25); //new Integer(25);
        Integer primeiroNumero = lista[0];
        int compareTo = primeiroNumero.compareTo(25);
    }



    private static void misturando() {
        int[] lista = new int[1];
        lista[0] = Integer.valueOf(25); //new Integer(25);
        Integer primeiroNumero = lista[0];
        int compareTo = primeiroNumero.compareTo(25);

    }


}
