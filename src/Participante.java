// ====================================================
// Classe: Participante
// Herda de Usuario e implementa a interface Exibivel
// Conceitos POO: Herança, Polimorfismo, Interface
// ====================================================

public class Participante extends Usuario implements Exibivel {

    // Atributos privados
    private String tipoParticipacao;
    private Atividade atividade;

    // Construtor padrão
    public Participante() {
        super();
        this.tipoParticipacao = "";
        this.atividade = null;
    }

    // Construtor com todos os parâmetros
    public Participante(String nome, String email, String tipoParticipacao, Atividade atividade) {
        super(nome, email);
        this.tipoParticipacao = tipoParticipacao;
        this.atividade = atividade;
    }

    // Getters e Setters

    public String getTipoParticipacao() {
        return tipoParticipacao;
    }

    public void setTipoParticipacao(String tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.atividade = atividade;
    }

    // Sobrescrita do método exibirDados (polimorfismo)
    @Override
    public void exibirDados() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║       DADOS DO PARTICIPANTE         ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("  Nome: " + getNome());
        System.out.println("  Email: " + getEmail());
        System.out.println("  Tipo: " + tipoParticipacao);
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║         ATIVIDADE VINCULADA            ║");
        System.out.println("╠══════════════════════════════════════╣");
        if (atividade != null) {
            atividade.exibirAtividade();
        } else {
            System.out.println("  Nenhuma atividade vinculada.");
        }
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println();
    }
}
