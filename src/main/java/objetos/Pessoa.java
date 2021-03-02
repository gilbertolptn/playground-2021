package objetos;

public class Pessoa {
    private String nome;

    public void setNome(String novoNome){
        if(novoNome.length() < 3){
            System.err.println("Não é possível alterar nome");
        }else {
            nome = novoNome;
        }
    }
    public String getNome(){
        return nome;
    }
}
