package comandos;

public class ExercicioIIComandos {

    public static void main(String[] args) {
        imprimirSoma1ate1000();
        imprimirMultiposde3ate100();

        int retorno = imprimirFatoriais1a10();
        System.out.println("Finalizou o fatorial com o valor: " + retorno);
    }

    public static int imprimirFatoriais1a10() {

        System.out.println("imprimirFatoriais1a10: ");

        int fatorial = 1;
        for( int contador = 1; contador <= 10; contador++ ) {
//            if(contador <= 1){
//                fatorial = 1;
//            }else{
                fatorial = contador * fatorial;
            //}
            System.out.println(contador + "!: " + fatorial);
        }

        System.out.println("-------------------------");

        return fatorial;
    }

    public static void imprimirMultiposde3ate100() {

        System.out.println("imprimirMultiposde3ate100: ");

//        for (int i = 1; i <= 100; i++) {
//            boolean isMultiplo = (i % 3 == 0);
//
//            if(isMultiplo){
//                System.out.println("Múltiplo de 3: "+ i);
//            }
//        }

        for (int i = 3; i <= 100; i += 3) { // i = i+3
            System.out.println("Múltiplo de 3: "+ i);
        }

        //ainda quero executar

        System.out.println("-------------------------");
    }

    public static void imprimirSoma1ate1000() {

        System.out.println("imprimirSoma1ate1000: ");

        //Atenção para o <= pois se não ficará em 999
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            soma = i+soma;
            System.out.println("i = "+ i + "-> " + soma);
        }
        System.out.println("-------------------------");
    }

}
