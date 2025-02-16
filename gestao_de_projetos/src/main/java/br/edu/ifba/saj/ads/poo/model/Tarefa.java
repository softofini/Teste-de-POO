package br.edu.ifba.saj.ads.poo.model;

import java.time.LocalDate;


public class Tarefa {
    private int idTarefa;
    private static int nextId = 1;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Boolean status;
    private String responsavel;
    

    public Tarefa(String nome, String descricao, LocalDate dataFim, String responsavel) {
        this.nome = nome;
        this.idTarefa = nextId++;
        this.descricao = descricao;
        this.dataInicio = LocalDate.now();
        this.dataFim = dataFim;
        this.responsavel = responsavel;
    }

    public int getIdTarefa() {
        return idTarefa;
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
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    } 
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

}
