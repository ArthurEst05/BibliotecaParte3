package Usuarios;

import java.io.Serializable;

public abstract class Usuarios implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id; 
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;
    private String senha;

    public Usuarios(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuarios(String nome, int idade, String sexo, String telefone,String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.senha = senha;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void lerLivro() {
        System.out.println("O usuário está lendo o livro");
    }

    public String getSenha() {
        return senha;
    }

    public abstract String getTipo();

    public static String getTipoUsuario(Usuarios usuario) {
    if (usuario != null) {
        return usuario.getTipo();
    } else {
        return "Usuário desconhecido";
    }
}


}
