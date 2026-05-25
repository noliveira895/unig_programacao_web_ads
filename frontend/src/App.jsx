import { useState } from "react";

export default function App() {
  const [participantes, setParticipantes] = useState([]);

  const [form, setForm] = useState({
    nome: "",
    email: "",
    tipo: "",
    evento: ""
  });

  function handleChange(e) {
    setForm({
      ...form,
      [e.target.name]: e.target.value
    });
  }

  function cadastrarParticipante(e) {
    e.preventDefault();

    if (!form.nome || !form.email || !form.tipo || !form.evento) {
      alert("Preencha todos os campos.");
      return;
    }

    setParticipantes([...participantes, form]);

    setForm({
      nome: "",
      email: "",
      tipo: "",
      evento: ""
    });
  }

  return (
    <div className="container">
      <header>
        <h1>Plataforma de Eventos Geek & Cultura Digital</h1>

        <p>
          Projeto acadêmico demonstrando conceitos de
          Programação Orientada a Objetos.
        </p>
      </header>

      <section className="card">
        <h2>Cadastro de Participantes</h2>

        <form onSubmit={cadastrarParticipante} className="formulario">

          <input
            type="text"
            name="nome"
            placeholder="Nome"
            value={form.nome}
            onChange={handleChange}
          />

          <input
            type="email"
            name="email"
            placeholder="Email"
            value={form.email}
            onChange={handleChange}
          />

          <select
            name="tipo"
            value={form.tipo}
            onChange={handleChange}
          >
            <option value="">Tipo de Participação</option>
            <option value="Jogador">Jogador</option>
            <option value="Cosplayer">Cosplayer</option>
            <option value="Palestrante">Palestrante</option>
            <option value="Visitante">Visitante</option>
          </select>

          <select
            name="evento"
            value={form.evento}
            onChange={handleChange}
          >
            <option value="">Evento</option>
            <option value="Campeonato Gamer">
              Campeonato Gamer
            </option>
            <option value="Concurso Cosplay">
              Concurso Cosplay
            </option>
            <option value="Palestra Tech">
              Palestra Tech
            </option>
          </select>

          <button type="submit">
            Cadastrar Participante
          </button>
        </form>
      </section>

      <section className="card">
        <h2>Participantes Cadastrados</h2>

        {participantes.length === 0 ? (
          <p>Nenhum participante cadastrado.</p>
        ) : (
          <div className="lista">
            {participantes.map((p, index) => (
              <div className="participante" key={index}>
                <h3>{p.nome}</h3>

                <p><strong>Email:</strong> {p.email}</p>

                <p><strong>Tipo:</strong> {p.tipo}</p>

                <p><strong>Evento:</strong> {p.evento}</p>
              </div>
            ))}
          </div>
        )}
      </section>

      <section className="card">
        <h2>Conceitos de POO Aplicados</h2>

        <ul>
          <li>Encapsulamento</li>
          <li>Herança</li>
          <li>Polimorfismo</li>
          <li>Abstração</li>
          <li>Interfaces</li>
          <li>Sobrecarga</li>
        </ul>
      </section>
    </div>
  );
}
