package enumeracoes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        // não dá new em enum = new TipoDeOpcao()
//        System.out.println(TipoDeOpcao.NAO.toString());//Obtém uma string com o valor "NAO"
//        System.out.println(TipoDeOpcao.SIM.name()); //Obtém uma string com o valor "SIM"

        //Criei uma lista do enum TipoDeOpcao
        List<TipoDeOpcao> tipos = new ArrayList<>();

        //Adiciono os valores que quero
        // tipos.add(TipoDeOpcao.NAO);
        // tipos.add(TipoDeOpcao.SIM);

        //Ou adiciono todos
        tipos.addAll(Arrays.asList(TipoDeOpcao.values()));

        for (TipoDeOpcao opcao : tipos){
            System.out.println(opcao);
        }
    }
}
