package tiposprimitivos;

public class ExerciciosTiposPrimitivos {

    //psvm...
    public static void main(String[] args) {
//        System.out.println("Argumentos:");
//        System.out.println(args[0]);
//        System.out.println(args[1]);

        byte idade = 33;
        System.out.printf("Idade: %d\n", idade);

        short anoAtual = 2021;
        System.out.printf("Ano Atual: %d\n", anoAtual);

        boolean estaChovendo = false;
        System.out.println("Está chovendo?: "+ estaChovendo);

        float pi = 3.141592653589793F;// usem F para indicar que é FLOAT
        System.out.printf("Valor de PI : %.15f\n", pi);

        float piComCast = (float) 3.141592653589793;
        System.out.printf("Valor de PI (com cast) : %.15f \n", piComCast);

        double piDouble = 3.141592653589793D;// D deixa claro que é Double
        System.out.printf("Valor de PI (double) : %.15f \n", piDouble);

        char primeiraLetraNome = 'G';
        System.out.printf("Primeira letra : %s \n", primeiraLetraNome);

        float precoDolarHoje = 5.36F;
        System.out.printf("Preço dólar : %.2f \n", precoDolarHoje);

        int populacaoBrasil = 209_000_000;// Pode usar alternativamente _ (underline) com separador de decimal
        System.out.printf("População Brasil : %d \n", populacaoBrasil);

        long populacaoMundial = 7_700_000_000L; //Usem L para deixar claro que é um Long
        System.out.printf("População Mundial : %d \n", populacaoMundial);

        //Quantidade de vendas de um dia de uma pequena empresa (1023)
        int quantidadeVendas = 1023;

        //Situação de um boleto (pago/não pago)
        boolean situacaoBoleto = true;

        //Tipo de pagamento (Crédito, Débito)
        char tipoPagamento = 'C'; //C- CREDITO, D-DEBITO - aspas simples para representar CHAR, duplas para String.

        //Conteúdo de um arquivo PDF
        byte[] conteudoArquivoPdf;// = new char[]{0, '2', };

        //CNPJ
        long cnpj = 12312312312300L;//L para definir como LONG

        //Valor de um produto, considerando itens de uma farmácia
        float valorProduto = 1200.00F;//F para definir como Float

        //Código de barras de um Produto
        long codigoBarras = 12345678901L;
    }
}
