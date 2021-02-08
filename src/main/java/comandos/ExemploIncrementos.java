package comandos;

public class ExemploIncrementos {

    public static void main(String[] args) {
        incrementos();
        uniaoDosOperadores();
    }

    private static void uniaoDosOperadores() {

        int valorInicial = 10;

        valorInicial *= 5; // valorInicial = valorInicial*5;
        valorInicial += 5; // valorInicial = valorInicial+5;

        int segundoValor = 2;

        int resultado = valorInicial *= segundoValor; // resultado = valorInicial = valorInicial * segundoValor;

        System.out.println(resultado);
    }

    private static void incrementos() {
        int meuNumero = 1;
        System.out.println(meuNumero);//imprime 1

        int meuOutroNumero = meuNumero++;//Obtém e copia para o meuOutroNumero antes de incrementar
        System.out.println(meuOutroNumero);//imprimir o 1 e incrementar depois

        System.out.println(meuNumero);//está com o valor 2 (incrementou acima)

        System.out.println(++meuNumero);//imprime o 3 (incrementou e imprimiu depois)
    }
}
