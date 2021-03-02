package objetos;

public class ExemplosPessoa {
    public static void main(String[] args) {

        Pessoa joao = new Pessoa();
        Pessoa gilberto = new Pessoa();

        joao.setNome("João");
        gilberto.setNome("Gilberto");

        System.out.println(joao.getNome());

        System.out.println(gilberto.getNome());
        gilberto.setNome("Gi");
        System.out.println(gilberto.getNome());
    }
}
