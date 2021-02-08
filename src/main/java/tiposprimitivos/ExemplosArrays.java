package tiposprimitivos;

public class ExemplosArrays {
    public static void main(String[] args) {

        exemploAnos();
        exemploTipoDeConta();
    }

    private static void exemploTipoDeConta() {
//        char[] tiposDeConta = new char[2];
//        tiposDeConta[0] = 'C';
//        tiposDeConta[0] = 'D';

        char[] tiposDeConta = new char[]{ 'C', 'D', 'B'};

        for (int i = 0; i < tiposDeConta.length ; i++){
            System.out.println(tiposDeConta[ i ]);
        }

        //FOREACH!
        // tipo nome : array
        for(char tipoConta : tiposDeConta ) {
            System.out.println(tipoConta);
        }
    }

    private static void exemploAnos() {
        int[] anos = new int[2]; // declaração com inicialização
        anos[0] = 2020;
        anos[1] = 2021;
        //anos.leght(); //Retorna o tamanho do array (2)
        //System.out.println(anos[0]);; //Obtém o item 0
    }
}
