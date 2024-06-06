package br.edu.poo.Aula9Jdbc;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {
    @Autowired PessoaDao dao;

    @PostMapping("/pessoa")
    public Pessoa incluir(@RequestBody Pessoa p) throws Exception {
        return dao.incluir(p);
    }

    @GetMapping("/pessoa")
    public List<Pessoa> listar() throws Exception {
       return dao.listar();
    }

    @GetMapping("/pessoa/{id}")
    public Pessoa obter(@PathVariable int id) throws Exception {
        return dao.obter(id);
    }

    @PutMapping("/pessoa/{id}")
    public Pessoa alterar(@PathVariable int id, @RequestBody Pessoa p) throws Exception {
        return dao.alterar(p);
    }

    @DeleteMapping("/pessoa/{id}")
    public boolean excluir(@PathVariable int id) throws Exception {
        return dao.excluir(id);
    }
}
