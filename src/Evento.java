// ====================================================
// Classe: Evento
// Representa um evento da plataforma geek
// Conceitos POO: Encapsulamento
// ====================================================

public class Evento {

    // Atributos privados (encapsulamento)
    private String nomeEvento;
    private String categoria;
    private String local;

    // Construtor padrão
    public Evento() {
        this.nomeEvento = "";
        this.categoria = "";
        this.local = "";
    }

    // Construtor com parâmetros
    public Evento(String nomeEvento, String categoria, String local) {
        this.nomeEvento = nomeEvento;
        this.categoria = categoria;
        this.local = local;
    }

    // Getters e Setters

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    // Exibe dados do evento no console
    public void exibirEvento() {
        System.out.println("  Evento: " + nomeEvento);
        System.out.println("  Categoria: " + categoria);
        System.out.println("  Local: " + local);
    }
}
