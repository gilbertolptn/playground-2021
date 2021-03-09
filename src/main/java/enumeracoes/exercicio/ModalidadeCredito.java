package enumeracoes.exercicio;

import java.util.Locale;

public class ModalidadeCredito {

    public TipoDeCartao obtemTipoDeCartao(double rendaMensal){

        String tipoDeCartao;

        if(rendaMensal < 1000){
            tipoDeCartao = "STANDARD ";

        } else if(rendaMensal < 3000){
            tipoDeCartao = "GOLD";

        }else if(rendaMensal < 10_000){
            tipoDeCartao = "PREMIUM";

        }else {
            tipoDeCartao = "BLACK";
        }

        return TipoDeCartao.valueOf(tipoDeCartao.toUpperCase().trim());
    }
}
