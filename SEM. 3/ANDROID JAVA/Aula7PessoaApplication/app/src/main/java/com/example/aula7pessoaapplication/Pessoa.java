package com.example.aula7pessoaapplication;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    String nome;
    int idade;
    boolean casada;
    double peso;
    String nascimento;
    List<String> amigos = new ArrayList<>();

    public void fromJSON(String json) throws Exception {
        JSONObject o = (JSONObject) new JSONTokener(json).nextValue();
        this.nome = o.getString("nome");
        this.idade = o.getInt("idade");
        this.casada = o.getBoolean("casada");
        this.peso = o.getDouble("peso");
        this.nascimento = o.getString("nascimento");
        amigos.clear();
        JSONArray amigos = o.getJSONArray("amigos");
        for (int i = 0; i < amigos.length(); i++) {
            this.amigos.add(amigos.getString(i));
        }
    }

    public String toJSON() throws Exception {
        JSONObject obj = new JSONObject();
        obj.put("nome", this.nome);
        return obj.toString();
    }
}
