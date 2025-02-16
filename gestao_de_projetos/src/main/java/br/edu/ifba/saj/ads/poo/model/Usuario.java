package br.edu.ifba.saj.ads.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private static int nextId = 1;
    private String login;
    private String senha;
    private String username;
    private List<Tarefa> tarefas = new ArrayList<>();
        

public Usuario(String login, String senha, String username) {
        this.id = nextId++;
        this.login = login;
        this.senha = senha;
        this.username = username;
    }
    public int getId() {
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
    public void addTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }
    public List<Tarefa> getTarefas() {
        return tarefas;
    }

}
