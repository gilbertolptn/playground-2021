package codigobarras.validator;

/*
- Lançamos um novo tipo de código de barras composto de 22 dígitos
- Os 20 números primeiros números são a numeração definida pelo estabelecimento e os 2 restantes são os dígitos verificadores.
- Os dígitos verificadores são compostos da soma dos 20 primeiros números.
- Caso a soma ultrapasse 99, ou seja, use mais de 2 casas, são consideradas somente as duas últimas casas.
*/
public class CodigoBarrasValidatorArrayUnificado {

    public static void main(String[] args) {

        //Inválidos
        //int[] codigoBarras = {2,1,3,5,7,8,5,5,5,2,3,4,1,2,3,4,5,6,7,8,4,3};// Deveria ser 86
        int[] codigoBarras = {4,2,4,2,3,4,2,3,4,2,3,4,2,4,2,3,4,2,3,4,2,3};//Digito 61 - invalido
        //int[] codigoBarras = {1,2,7,9,1,9};//Menor tamanho - inválido

        //Válidos
        //int[] codigoBarras = {2,1,3,5,7,8,5,5,5,2,3,4,1,2,3,4,5,6,7,8,8,6};
        //int[] codigoBarras = {9,8,8,9,9,9,7,9,9,9,8,9,9,9,8,9,7,9,7,9,7,0};//Digito 170

        //Validação inicial
        if(codigoBarras.length != 22){
            System.err.println("* Tamanho deve ser igual a 22!");
            return;
        }

        //Cálculo dígitos
        int soma = 0;
        for (int i = 0; i < 20; i++) {
            soma += codigoBarras[i];
        }
        System.out.println(" -> Soma: "+ soma);

        //MOD10 - se 1, fica 1. Se 23 fica 3. Se 227 fica 7.
        int unidade = soma % 10;

        // Divisão/10 para pegar o decimal e o MOD10 é para resolver o > 99
        int decimal = (soma/10) % 10;//resto de 10 deixa só a unidade
        System.out.println(" -> Digito verificador calculado: "+ decimal + unidade);

        int[] digitoCalculado = new int[]{ decimal, unidade};

        //Obtém os últimos dígitos
        int[] digitosVerificadores = {codigoBarras[20], codigoBarras[21]};
        System.out.println(" -> Dígito verificador original: " + codigoBarras[20] + codigoBarras[21]);

        //Verifica se é válido
        boolean valido =
                digitoCalculado[0] == digitosVerificadores[0] &&
                digitoCalculado[1] == digitosVerificadores[1];

        if(valido){
            System.out.println("* Código de Barras válido!");
        }else{
            System.err.println("* Código de Barras inválido!");
        }
    }

}
