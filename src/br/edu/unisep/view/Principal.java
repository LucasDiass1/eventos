package br.edu.unisep.view;

public class Principal {
    public static void main(String[] args) {
        Evento evento = new Evento("Conferência de Tecnologia", "2024-10-15");

        Palestrante palestrante1 = new Palestrante("Alice");
        Palestrante palestrante2 = new Palestrante("Bob");

        Sessao sessao = new Sessao("Futuro da IA");
        sessao.adicionarPalestrante(palestrante1);
        sessao.adicionarPalestrante(palestrante2);

        evento.adicionarSessao(sessao);

        Participante participante1 = new Participante("Carlos");
        Participante participante2 = new Participante("Diana");

        sessao.inscreverParticipante(participante1);
        sessao.inscreverParticipante(participante2);

        System.out.println("Evento: " + evento.getNome() + ", Data: " + evento.getData());
        evento.listarSessoes();
    }
}