package br.com.teste.personaula;

import org.json.JSONObject;

public class Login {
    public String login;
    public String senha;

    public String toJSON()throws Exception{
        JSONObject obj = new JSONObject();
        obj.put("login", this.login);
        obj.put("senha", this.senha);
        return obj.toString();
    }
}
