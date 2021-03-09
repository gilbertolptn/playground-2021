package enumeracoes.exercicio;

public class ExercicioEnumeracoes {

    public static void main(String[] args) {

        ModalidadeCredito modalidade = new ModalidadeCredito();
        System.out.println(modalidade.obtemTipoDeCartao(999));
        System.out.println(modalidade.obtemTipoDeCartao(2_999));
        System.out.println(modalidade.obtemTipoDeCartao(9_999));
        System.out.println(modalidade.obtemTipoDeCartao(10_001));
    }
}
