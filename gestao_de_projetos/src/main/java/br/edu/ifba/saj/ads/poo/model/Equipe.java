package br.edu.ifba.saj.ads.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private int idEquipe;
    private static int nextId = 1;
    private String nome;
    private List<Usuario> membros = new ArrayList<>();


    public Equipe(String nome) {
        this.nome = nome;
        this.idEquipe = nextId++;
    }

    public int getIdEquipe() {
        return idEquipe;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public void addMembros(Usuario usuario) {
        this.membros.add(usuario);
    }
    public List<Usuario> getMembros() {
        return membros;
    }
}
