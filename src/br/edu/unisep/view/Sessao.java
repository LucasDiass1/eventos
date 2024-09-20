package br.edu.unisep.view;

import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private String titulo;
    private List<Palestrante> palestrantes;
    private List<Participante> inscricoes;

    public Sessao(String titulo) {
        this.titulo = titulo;
        this.palestrantes = new ArrayList<>();
        this.inscricoes = new ArrayList<>();
    }

    public void adicionarPalestrante(Palestrante palestrante) {
        palestrantes.add(palestrante);
    }

    public void inscreverParticipante(Participante participante) {
        inscricoes.add(participante);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPalestrantesNomes() {
        List<String> nomes = new ArrayList<>();
        for (Palestrante p : palestrantes) {
            nomes.add(p.getNome());
        }
        return String.join(", ", nomes);
    }
}