package visibilidade;

public class A {
    private String atributoPrivado;
    String atributoPackage; //package (~) ou DEFAULT
    protected String atributoProtected;
    public String atributoPublico;

    //Métodos públicos se comportam como atributos públicos
    public void acaoPublica(){
    }

    //Métodos privados se comportam como atributos privados
    private void acaoPrivada(){
    }

    //Métodos default/package se comportam como atributos default/package
    void acaoPackage(){
    }

    //Métodos protected se comportam como atributos protected
    protected void acaoProtected(){
    }
}
