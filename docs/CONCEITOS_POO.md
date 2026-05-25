# Conceitos de POO Implementados

## 1. Encapsulamento
**Descrição**: Atributos privados com acesso controlado via getters e setters.
**Objetivo**: Proteger o estado interno dos objetos.

**Implementação**:
- Atributos declarados como `private`
- Getters (métodos de leitura) são `public`
- Setters (métodos de escrita) validam dados antes de atribuir
- Exemplo: `private String nome; → public String getNome()`

**Benefícios**:
- Proteção contra atribuições inválidas
- Flexibilidade para mudar implementação interna
- Validação centralizada

---

## 2. Herança
**Descrição**: Participante herda de Usuario, reutilizando atributos e métodos.
**Objetivo**: Reutilizar código e estabelecer relacionamentos hierárquicos.

**Implementação**:
```java
public class Participante extends Usuario {
    // Herda nome e email
    // Herda getNome(), setNome(), getEmail(), setEmail()
    // Adiciona tipoParticipacao e evento
}
```

**Benefícios**:
- Reutilização de código
- Estabelecimento de relacionamentos
- Facilita manutenção

---

## 3. Polimorfismo
**Descrição**: Sobrescrita de métodos permite comportamento diferente para cada tipo.
**Objetivo**: Implementar comportamentos específicos mantendo interface comum.

**Implementação**:
```java
Usuario[] usuarios = { p1, p2, p3 };
for (Usuario u : usuarios) {
    u.exibirDados(); // Mesmo método, comportamentos diferentes
}
```

**Benefícios**:
- Código mais genérico e reutilizável
- Facilita extensão sem modificação
- Maior flexibilidade

---

## 4. Abstração
**Descrição**: Classe abstrata define estrutura sem implementação completa.
**Objetivo**: Obrigar subclasses a implementar métodos específicos.

**Implementação**:
```java
public abstract class Usuario {
    abstract void exibirDados();
}
```

**Benefícios**:
- Define contrato que deve ser seguido
- Impede instanciação de classes genéricas
- Força implementação de métodos críticos

---

## 5. Interface
**Descrição**: Define contrato que classes concretas devem seguir.
**Objetivo**: Garantir consistência entre implementações distintas.

**Implementação**:
```java
public interface Exibivel {
    void exibirDados();
}

public class Participante extends Usuario implements Exibivel {
    @Override
    public void exibirDados() { }
}
```

**Benefícios**:
- Múltipla implementação
- Definição clara de responsabilidades
- Facilita polimorfismo

---

## 6. Sobrecarga
**Descrição**: Métodos com mesmo nome mas assinaturas diferentes.
**Objetivo**: Fornecer flexibilidade na chamada de métodos.

**Implementação**:
```java
// Sobrecarga 1: apenas nome
public static Participante cadastrarParticipante(String nome) { }

// Sobrecarga 2: nome e email
public static Participante cadastrarParticipante(String nome, String email) { }
```

**Benefícios**:
- Mesma operação, diferentes parâmetros
- Interface mais intuitiva
- Maior flexibilidade

---

## 📊 Diagrama de Classes

```
┌─────────────┐
│  Exibivel   │ (Interface)
│   <<if>>    │
└──────┬──────┘
       △
       │ implements
       │
┌──────┴────────────┐
│  Usuario (abstract)│
│      <<abstract>>  │
├────────────────────┤
│ - nome: String     │
│ - email: String    │
├────────────────────┤
│ + getNome()        │
│ + setNome()        │
│ + getEmail()       │
│ + setEmail()       │
│ + exibirDados()    │ (abstract)
└─────────┬──────────┘
          △
          │ extends
          │
     ┌────┴────┐
     │Participante│
     ├─────────────┤
     │- tipoParticipacao│
     │- evento    │
     ├─────────────┤
     │ + exibirDados()  │ (override)
     │ + getEvento()    │
     │ + setEvento()    │
     └─────────────┘
            △
            │ possui
            │
        ┌───┴────┐
        │ Evento  │
        ├─────────┤
        │- nome   │
        │- categoria │
        │- local  │
        ├─────────┤
        │+ exibirEvento() │
        └─────────┘
```

---

## 🔍 Tratamento de Erros

O projeto implementa validação através de `try/catch`:

```java
try {
    Participante p = new Participante();
    p.setNome(""); // Lança IllegalArgumentException
} catch (IllegalArgumentException ex) {
    System.out.println("[!] " + ex.getMessage());
}
```

**Validações Implementadas**:
- Nome não pode ser vazio
- Email deve conter '@' e '.'

---
