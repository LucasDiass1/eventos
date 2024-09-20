package br.edu.unisep.view;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String data;
    private List<Sessao> sessoes;

    public Evento(String nome, String data) {
        this.nome = nome;
        this.data = data;
        this.sessoes = new ArrayList<>();
    }

    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

    public void listarSessoes() {
        for (Sessao sessao : sessoes) {
            System.out.println("Sessão: " + sessao.getTitulo() + ", Palestrante(s): " + sessao.getPalestrantesNomes());
        }
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }
}