package br.com.teste.nomesmaria;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    int altura;
    String pai; String mae; boolean casada;
    List<String> amigos = new ArrayList<>();

    public void fromJSON(String json) throws Exception{
        JSONObject o = (JSONObject) new JSONTokener(json).nextValue();
        this.nome   =   o.getString("nome");
        this.idade  =   o.getInt("idade");
        this.peso   =   o.getDouble("peso");
        this.altura =   o.getInt("altura");
        this.pai    =   o.getString("pai");
        this.mae    =   o.getString("mae");
        this.casada =   o.getBoolean("casada");

        amigos.clear();
        JSONArray amigos = o.getJSONArray("amigos");
        for (int i = 0; i < amigos.length(); i ++){
            this.amigos.add(amigos.getString(i));
        }

    }

    public String toJSON(){
        return"{}";
    }
}
