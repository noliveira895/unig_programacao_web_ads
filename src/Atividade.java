// ====================================================
// Classe: Atividade
// Representa atividades dos eventos geek
// Conceitos POO: Encapsulamento e Associação
// ====================================================

public class Atividade {

    // Atributos privados
    private String nomeAtividade;
    private String tipoAtividade;
    private String horario;
    private Evento evento;

    // Construtor padrão
    public Atividade() {
        this.nomeAtividade = "";
        this.tipoAtividade = "";
        this.horario = "";
        this.evento = null;
    }

    // Construtor com parâmetros
    public Atividade(String nomeAtividade, String tipoAtividade, String horario, Evento evento) {
        this.nomeAtividade = nomeAtividade;
        this.tipoAtividade = tipoAtividade;
        this.horario = horario;
        this.evento = evento;
    }

    // Getters e Setters

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    // Exibição dos dados da atividade
    public void exibirAtividade() {
        System.out.println("  Atividade: " + nomeAtividade);
        System.out.println("  Tipo: " + tipoAtividade);
        System.out.println("  Horário: " + horario);

        if (evento != null) {
            System.out.println("  Evento relacionado:");
            evento.exibirEvento();
        }
    }
}
