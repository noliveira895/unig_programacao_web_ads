# Plataforma de Eventos Geek & Cultura Digital

## 📋 Descrição
Projeto acadêmico em Java demonstrando os pilares da Programação Orientada a Objetos (POO).

## 🎯 Conceitos Implementados
- **Encapsulamento**: Atributos privados com acesso controlado via getters e setters. Protege o estado interno dos objetos.
- **Herança**: Participante herda de Usuario, reutilizando atributos e métodos da classe pai.
- **Polimorfismo**: Sobrescrita do método exibirDados() permite comportamento diferente para cada tipo de objeto.
- **Abstração**: Classe abstrata Usuario define estrutura sem implementação completa. Obriga subclasses a implementar.
- **Interface**: Interface Exibivel define contrato que classes concretas devem seguir, garantindo consistência.
- **Sobrecarga**: Métodos cadastrarParticipante com diferentes assinaturas, permitindo flexibilidade no cadastro.

## 📁 Estrutura do Projeto
```
Projeto_Eventos_Geek/
│
├── docs/
│   ├── Relatorio.pdf
│   ├── Diagramas/
│   └── Imagens/
│
├── backend-java/
│   └── src/
│       ├── Usuario.java
│       ├── Participante.java
│       ├── Evento.java
│       ├── Atividade.java
│       ├── Exibivel.java
│       └── Main.java
│
├── frontend/
│   ├── src/
│   ├── package.json
│   ├── vite.config.js
│   ├── index.html
│   └── README.md
│
└── README_GERAL.txt
```

## 🔄 Relacionamentos
- `Participante` extends `Usuario`
- `Participante` implements `Exibivel`
- `Participante` possui `Evento`

## 🚀 Como Compilar e Executar
```bash
# Compilar todas as classes
javac src/*.java

# Executar o programa
java -cp src Main
```

## 📚 Detalhes das Classes

### Exibivel (Interface)
Define o contrato para exibição de dados no sistema.
- Método: `void exibirDados()`

### Usuario (Classe Abstrata)
Classe base que representa um usuário genérico.
- Atributos: `nome`, `email`
- Método abstrato: `exibirDados()`
- Validações de encapsulamento

### Evento
Representa um evento da plataforma.
- Atributos: `nomeEvento`, `categoria`, `local`
- Getters e Setters para acesso controlado

### Participante
Herda de `Usuario` e implementa `Exibivel`.
- Atributos adicionais: `tipoParticipacao`, `evento`
- Implementa polimorfismo através de `exibirDados()`

### Main
Classe principal que demonstra:
- Criação de objetos
- Polimorfismo
- Sobrecarga de métodos
- Tratamento de erros com try/catch

## 💡 Principais Conceitos Demonstrados

### Encapsulamento
Atributos privados com acesso via getters e setters:
```java
private String nome;
public String getNome() { return nome; }
public void setNome(String nome) { /* validação */ }
```

### Herança
```java
public class Participante extends Usuario { }
```

### Polimorfismo
```java
Usuario[] usuarios = { p1, p2, p3 };
for (Usuario u : usuarios) {
    u.exibirDados(); // Comportamento diferente para cada tipo
}
```

### Abstração
```java
public abstract class Usuario {
    public abstract void exibirDados();
}
```

### Interface
```java
public interface Exibivel {
    void exibirDados();
}
```

### Sobrecarga
```java
public static Participante cadastrarParticipante(String nome) { }
public static Participante cadastrarParticipante(String nome, String email) { }
```

## 🎓 Objetivo Educacional
Este projeto demonstra de forma prática e integrada os pilares da POO, 
sendo ideal para estudantes de Análise e Desenvolvimento de Sistemas (ADS).

---
**Criado para**: ADS 2026
**Tipo de Projeto**: Acadêmico
**Linguagem**: Java


## Nova Classe Implementada
- Atividade: representa campeonatos, palestras e concursos vinculados aos eventos.
