import { useState } from "react";
import "./styles.css";

export default function App() {
  const [pagina, setPagina] = useState("home");

  const [participantes, setParticipantes] = useState([]);

  const [form, setForm] = useState({
    nome: "",
    email: "",
    atividade: ""
  });

  function handleChange(e) {
    setForm({
      ...form,
      [e.target.name]: e.target.value
    });
  }

  function cadastrarParticipante(e) {
    e.preventDefault();

    if (!form.nome || !form.email || !form.atividade) {
      alert("Preencha todos os campos.");
      return;
    }

    setParticipantes([...participantes, form]);

    alert("Participante cadastrado com sucesso!");

    setForm({
      nome: "",
      email: "",
      atividade: ""
    });
  }

  return (
    <div>
      <nav className="navbar">
        <h2>Geek Universe 2026</h2>

        <div className="menu">
          <button onClick={() => setPagina("home")}>Início</button>
          <button onClick={() => setPagina("eventos")}>Eventos</button>
          <button onClick={() => setPagina("sobre")}>Sobre</button>
        </div>
      </nav>

      {pagina === "home" && (
        <section>
          <header className="hero">
            <div className="hero-content">
              <h1>Geek Universe 2026</h1>

              <p>
                O maior evento geek e tecnológico da região.
                Campeonatos, cosplay, palestras e experiências digitais.
              </p>

              <button
                className="hero-btn"
                onClick={() => {
                  document
                    .getElementById("formulario")
                    .scrollIntoView({ behavior: "smooth" });
                }}
              >
                Quero Participar
