package enumeracoes.avancado;

public class ProgramaMovimento {
    public static void main(String[] args) {

//        TarifaMovimento tarifa = new TarifaMovimento();
//        float valorTarifa = tarifa.valorTarifa(TipoMovimento.TED);
//        System.out.println(valorTarifa);

        //Valor tarifa TED
        System.out.println(TipoMovimento.TED.getSigla());
        System.out.println(TipoMovimento.TED.getValorTarifa());
        System.out.println(TipoMovimento.values()[0].getSigla());
        System.out.println(TipoMovimento.values()[0].getValorTarifa());

        System.out.println(TipoMovimento.obtemAPartirDaSigla("S"));
        System.out.println(TipoMovimento.obtemAPartirDaTarifa(0F));


    }
}
