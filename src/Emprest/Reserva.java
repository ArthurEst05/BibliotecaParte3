package Emprest;

import Obras.Livro;
import Usuarios.Usuarios;

public class Reserva {
    private int id;
    private Emprestimos Emprestimo;
    private Livro livros;
    private Usuarios usuarios;
    private String status;

    public Reserva(Livro livros, Usuarios usuarios) {
        if (livros.isDisponivel()) {
            throw new IllegalArgumentException("Livro está disponível, faça um empréstimo em vez de uma reserva.");
        }
        this.livros = livros;
        this.usuarios = usuarios;
        this.status = "Ativa";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Emprestimos getEmprestimo() {
        return Emprestimo;
    }

    public void setEmprestimo(Emprestimos emprestimo) {
        Emprestimo = emprestimo;
    }

    public Livro getLivros() {
        return livros;
    }

    public void setLivros(Livro livros) {
        this.livros = livros;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void cancelar() {
        this.status = "Cancelada";
    }

    // Método para verificar se a reserva está ativa
    public boolean isAtiva() {
        return this.status.equals("Ativa");
    }
}
