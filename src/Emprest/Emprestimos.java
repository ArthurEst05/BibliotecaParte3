package Emprest;
import Obras.Livro;
import Usuarios.Usuarios;

public class Emprestimos {
    private int id;
    private String dataDoEmprestimo;
    private String horaDoEmprestimo;
    private Livro livros;
    private Usuarios usuarios;

    
    
    public Emprestimos(int id, String dataDoEmprestimo, String horaDoEmprestimo, Livro livros, Usuarios usuarios) {
        this.id = id;
        this.dataDoEmprestimo = dataDoEmprestimo;
        this.horaDoEmprestimo = horaDoEmprestimo;
        this.livros = livros;
        this.usuarios = usuarios;
    }
    public Emprestimos(String dataDoEmprestimo, String horaDoEmprestimo, Livro livros, Usuarios usuarios) {
        this.dataDoEmprestimo = dataDoEmprestimo;
        this.horaDoEmprestimo = horaDoEmprestimo;
        this.livros = livros;
        this.usuarios = usuarios;
    }
    public String getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }
    public void setDataDoEmprestimo(String dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }
    public String getHoraDoEmprestimo() {
        return horaDoEmprestimo;
    }
    public void setHoraDoEmprestimo(String horaDoEmprestimo) {
        this.horaDoEmprestimo = horaDoEmprestimo;
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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void devolverLivro(Livro livro){
        livro.setEmprestimo(true);
        System.out.println("Livro devolvido");
    }

}
