# Estrutura do Projeto

## Hierarquia de Classes

### 1. Exibivel (Interface)
```
Arquivo: Exibivel.java
Tipo: Interface
Responsabilidade: Define contrato para exibição de dados
Métodos:
  - void exibirDados()
```

### 2. Usuario (Classe Abstrata)
```
Arquivo: Usuario.java
Tipo: Classe Abstrata
Herança: Nenhuma
Responsabilidade: Base para todos os usuários do sistema
Atributos:
  - private String nome
  - private String email
Métodos:
  - public Usuario()
  - public Usuario(String nome, String email)
  - public String getNome()
  - public void setNome(String nome)
  - public String getEmail()
  - public void setEmail(String email)
  - public abstract void exibirDados()
```

### 3. Evento (Classe Concreta)
```
Arquivo: Evento.java
Tipo: Classe Concreta
Herança: Nenhuma
Responsabilidade: Representa um evento da plataforma
Atributos:
  - private String nomeEvento
  - private String categoria
  - private String local
Métodos:
  - public Evento()
  - public Evento(String nomeEvento, String categoria, String local)
  - Getters e Setters para todos os atributos
  - public void exibirEvento()
```

### 4. Participante (Classe Concreta)
```
Arquivo: Participante.java
Tipo: Classe Concreta
Herança: extends Usuario
Interfaces: implements Exibivel
Responsabilidade: Representa um participante de um evento
Atributos Próprios:
  - private String tipoParticipacao
  - private Evento evento
Atributos Herdados:
  - nome (de Usuario)
  - email (de Usuario)
Métodos:
  - public Participante()
  - public Participante(String nome, String email, String tipoParticipacao, Evento evento)
  - Getters e Setters para atributos próprios
  - public void exibirDados() @Override
```

### 5. Main (Classe Principal)
```
Arquivo: Main.java
Tipo: Classe Principal
Responsabilidade: Testar e demonstrar o sistema
Métodos:
  - public static Participante cadastrarParticipante(String nome)
  - public static Participante cadastrarParticipante(String nome, String email)
  - public static void main(String[] args)
Demonstra:
  - Criação de objetos
  - Polimorfismo
  - Sobrecarga de métodos
  - Tratamento de erros
```

## Fluxo de Execução (Main)

1. **Inicialização**
   - Exibe banner de boas-vindas
   
2. **Criação de Eventos**
   - Cria 3 objetos Evento
   - Armazena dados específicos de cada evento
   
3. **Cadastro de Participantes**
   - Cria 3 objetos Participante
   - Vincula cada participante a um evento
   
4. **Demonstração de Polimorfismo**
   - Usa array de Usuario (tipo pai)
   - Chama exibirDados() que executa implementação de Participante
   
5. **Demonstração de Sobrecarga**
   - Chama cadastrarParticipante com diferentes assinaturas
   
6. **Demonstração de Interface**
   - Usa array de Exibivel
   - Demonstra múltiplas implementações
   
7. **Tratamento de Erros**
   - Testa validações com try/catch
   - Demonstra IllegalArgumentException

## Padrões Utilizados

### 1. Encapsulamento
- Atributos privados
- Acesso via getters/setters
- Validação em setters

### 2. Construtores Sobrecarregados
- Construtor padrão
- Construtor com parâmetros

### 3. Validação de Dados
- Nome não vazio
- Email válido (contém @ e .)
- Try/catch para tratamento

### 4. Polimorfismo Dinâmico
- Referência do tipo pai
- Execução de método sobrescrito
- Comportamento diferente por tipo

---
