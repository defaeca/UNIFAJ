package br.edu.poo.Aula9Jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PessoaDao {
    private @Autowired JdbcTemplate jdbcTemplate;

    public Pessoa incluir(Pessoa p) throws Exception {
        String sqlInsert = "INSERT INTO Pessoa (NOME, ENDERECO, TELEFONE) "
                + "VALUES (?, ?, ?)";
        try (Connection con = jdbcTemplate.getDataSource().getConnection();
             PreparedStatement ps = con.prepareStatement(sqlInsert);) {
            ps.setString(1, p.getNome());
            ps.setString(2, p.getEndereco());
            ps.setString(3, p.getTelefone());
            int result = ps.executeUpdate();
            if (result == 1) {
                System.out.println("Pessoa inserida com sucesso.");
                return p;
            }
            throw new Exception("Erro na inserção.");
        }
    }


    public List<Pessoa> listar() throws Exception {
        String sql = "SELECT id, nome, endereco, telefone from pessoa";
        List<Pessoa> lista = new ArrayList<>();
        try (Connection con = jdbcTemplate.getDataSource().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
          ) {
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    Pessoa p = getPessoa(rs);
                    lista.add(p);
                }
            }
        }
        return lista;
    }

    public Pessoa obter(int id) throws Exception {
        String sql = "SELECT id, nome, endereco, telefone from pessoa " +
                "where id = ?";
        try (Connection con = jdbcTemplate.getDataSource().getConnection();
             PreparedStatement ps = con.prepareStatement(sql); ) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    Pessoa p = getPessoa(rs);
                    return p;
                }
            }
        }
        throw new Exception("Não encontrado");
    }


    private static Pessoa getPessoa(ResultSet rs) throws SQLException {
        Pessoa p = new Pessoa();
        p.setId(rs.getInt("id"));
        p.setNome(rs.getString("nome"));
        p.setEndereco(rs.getString("endereco"));
        p.setTelefone(rs.getString("telefone"));
        return p;
    }

    public Pessoa alterar(Pessoa p) throws Exception {
        String sqlUpdate = "update pessoa set nome = ?, endereco=?, " +
                "telefone=? where id = ?";
        try (Connection con = jdbcTemplate.getDataSource().getConnection();
             PreparedStatement ps = con.prepareStatement(sqlUpdate);) {
            ps.setString(1, p.getNome());
            ps.setString(2, p.getEndereco());
            ps.setString(3, p.getTelefone());
            ps.setInt(4, p.getId());
            int result = ps.executeUpdate();
            if (result == 1) {
                System.out.println("Pessoa atualizada com sucesso.");
                return p;
            }
            throw new Exception("Erro na atualização.");
        }
    }

    public boolean excluir(int id) throws Exception {
        String sqlUpdate = "delete from pessoa where ID = ?";
        try (Connection con = jdbcTemplate.getDataSource().getConnection();
             PreparedStatement ps = con.prepareStatement(sqlUpdate);) {
            ps.setInt(1, id);
            int result = ps.executeUpdate();
            if (result == 1) {
                System.out.println("Pessoa excluída com sucesso.");
                return true;
            }
            throw new Exception("Erro na exclusão.");
        }
    }
}
