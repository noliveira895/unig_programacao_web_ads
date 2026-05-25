// ====================================================
// Classe Principal: Main
// Responsável por testar e demonstrar o sistema
// Conceitos POO: Polimorfismo, Sobrecarga, Try/Catch
// ====================================================

public class Main {

    // Cadastro apenas com nome (sobrecarga 1)
    public static Participante cadastrarParticipante(String nome) {
        Participante p = new Participante();
        p.setNome(nome);
        p.setEmail(nome.toLowerCase().replace(" ", ".") + "@email.com");
        p.setTipoParticipacao("Visitante");
        System.out.println("[+] Participante cadastrado (somente nome): " + nome);
        return p;
    }

    // Cadastro com nome e email (sobrecarga 2)
    public static Participante cadastrarParticipante(String nome, String email) {
        Participante p = new Participante();
        p.setNome(nome);
        p.setEmail(email);
        p.setTipoParticipacao("Visitante");
        System.out.println("[+] Participante cadastrado (nome + email): " + nome);
        return p;
    }

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║  PLATAFORMA DE EVENTOS GEEK & CULTURA DIGITAL ║");
        System.out.println("║            Sistema de Cadastro v2.0          ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        // Criação dos eventos
        Evento evento1 = new Evento("Geek Experience", "Tecnologia", "Rio de Janeiro");
        Evento evento2 = new Evento("Arena Games", "E-Sports", "São Paulo");

        // Criação das atividades
        Atividade atividade1 = new Atividade(
                "Campeonato Valorant",
                "Competição",
                "14:00",
                evento2);

        Atividade atividade2 = new Atividade(
                "Concurso Cosplay",
                "Cosplay",
                "16:00",
                evento1);

        Atividade atividade3 = new Atividade(
                "Palestra sobre IA",
                "Palestra",
                "18:00",
                evento1);

        // Criação dos participantes
        Participante p1 = new Participante(
                "Nathan Oliveira",
                "nathan@email.com",
                "Jogador",
                atividade1);

        Participante p2 = new Participante(
                "Beatriz Lima",
                "bia@email.com",
                "Cosplayer",
                atividade2);

        Participante p3 = new Participante(
                "Carlos Souza",
                "carlos@email.com",
                "Palestrante",
                atividade3);

        // Polimorfismo
        Usuario[] usuarios = { p1, p2, p3 };

        System.out.println();
        System.out.println("========== PARTICIPANTES CADASTRADOS ==========");

        for (Usuario usuario : usuarios) {
            usuario.exibirDados();
            System.out.println();
        }

        // Sobrecarga
        cadastrarParticipante("Ana Silva");
        cadastrarParticipante("Pedro Santos", "pedro@email.com");

        // Tratamento de erro
        try {
            Participante erro = new Participante();
            erro.setNome("");
        } catch (IllegalArgumentException e) {
            System.out.println();
            System.out.println("Erro capturado pelo sistema:");
            System.out.println(e.getMessage());
        }
    }
}
