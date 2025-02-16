package br.edu.ifba.saj.ads.poo.model;

public class Usuario {

    private Integer id;
    private String login;
    private String senha;
    private String username;
        

public Usuario(Integer id, String login, String senha, String username) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.username = username;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    } 

}
