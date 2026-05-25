// ====================================================
// Classe Abstrata: Usuario
// Representa a base genérica dos usuários da plataforma
// Conceitos POO: Abstração, Encapsulamento, Herança
// ====================================================

public abstract class Usuario {

    // Atributos privados (encapsulamento)
    private String nome;
    private String email;

    // Construtor padrão
    public Usuario() {
        this.nome = "";
        this.email = "";
    }

    // Construtor com parâmetros
    public Usuario(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }

    // Getters e Setters com validação

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O nome não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Erro: Email inválido. Deve conter '@' e '.'");
        }
        this.email = email.trim();
    }

    // Método abstrato — deve ser implementado pelas subclasses
    public abstract void exibirDados();
}
