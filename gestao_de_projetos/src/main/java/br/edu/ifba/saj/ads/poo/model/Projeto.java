package br.edu.ifba.saj.ads.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private int idProjeto;
    private static int nextId = 1;
    private String nome;
    private String descricao;
    private Boolean status;
    private String equipe;
    private List<Tarefa> tarefas = new ArrayList<>();

    public Projeto(String nome, String descricao, Equipe equipe) {
        this.nome = nome;
        this.idProjeto = nextId++;
        this.descricao = descricao;
        this.equipe = equipe.getNome();
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getResponsavel() {
        return equipe;
    }

    public void setResponsavel(String equipe) {
        this.equipe = equipe;
    }
    
}
