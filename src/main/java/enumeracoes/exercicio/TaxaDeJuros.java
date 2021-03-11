package enumeracoes.exercicio;

public class TaxaDeJuros {

    public float obtemTaxa(String tipo){
        return TipoCartao
                    .valueOf(tipo)
                    .getTaxaJuros();
    }
}
