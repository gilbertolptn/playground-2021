package introducao;


public class InformacoesSistema {


    //Atalho digite psvm
    public static void main(String[] args) {

        //System.out.println("Processadores disponíveis: ");
        //Atalho: digite sout
        //System.out.println(Runtime.getRuntime().availableProcessors());

        //printf ("template %s %d ", "variavel 1", "variavel 2"....)
        // %d - digito, %s - texto, %f - número com vírgula
        System.out.printf("Processadores disponíveis: %d \n", Runtime.getRuntime().availableProcessors());

        System.out.print("Memória máxima utilizada pela JVM (HEAP): ");
        System.out.printf("%d MB \n", Runtime.getRuntime().maxMemory()/1024/1024);

        System.out.print("Memória utilizada pela JVM (HEAP): ");
        System.out.printf("%d MB \n", Runtime.getRuntime().totalMemory()/1024/1024);

        // Dados binários, por exemplo, um arquivo PDF
        byte[] documento;

    }
}
