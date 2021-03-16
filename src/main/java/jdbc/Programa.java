package jdbc;

import java.sql.*;

public class Programa {

    public static void main(String[] args) throws SQLException {

        Conexao minhaConexao = new Conexao();

        String usuario = "admin";
        String senha = "Imers40JavaAdmin";
        String url = "jdbc:postgresql://165.227.108.225:5432/db_aluno9"; //db_alunoX
        minhaConexao.conectar(url, usuario, senha);

        String sql = "insert into vacina (nome) values ('Covid') ";
        minhaConexao.inserir(sql);

        //consultar os dados inseridos
        ResultSet rs = minhaConexao.consultar("select id,nome from vacina");

        while (rs.next()){
            System.out.printf("%d - %s\n", rs.getInt("id"), rs.getString("nome"));//rs.getString(1)
        }

        minhaConexao.desconectar();
    }
}
