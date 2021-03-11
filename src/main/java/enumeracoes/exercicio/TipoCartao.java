package enumeracoes.exercicio;

public enum TipoCartao {
    STANDARD(3.05F),
    GOLD(3.05F),
    PREMIUM(2.95F),
    BLACK(1.98F);

    private float taxaJuros;

    TipoCartao(float taxaDeJuros) {
        this.taxaJuros = taxaDeJuros;
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }
}
