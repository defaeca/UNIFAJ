package br.edu.poo.Aula9Jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.SQLException;

public class PessoaDao {
    private @Autowired JdbcTemplate jdbcTemplate;

    public Pessoa incluir(Pessoa p) throws SQLException {
        try (Connection con = jdbcTemplate.getDataSource().getConnection();){

        }
        return p;
    }
}
