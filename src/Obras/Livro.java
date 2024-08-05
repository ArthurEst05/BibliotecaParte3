package Obras;

import java.io.Serializable;

public class Livro extends Obra implements Serializable{
    private static final long serialVersionUID = 1L;

    private String editora;
    private String edicao;
    private int numFolhas;
    private boolean emprestimo;

    
    public Livro(String titulo, String autores, String area, String ano) {
        super(titulo, autores, area, ano);
    }

    public Livro(String titulo, String autores, String area,String editora, String ano, String edicao, int numFolhas, boolean emprestimo) {
        super(titulo, autores, area, ano);
        this.editora = editora;
        this.edicao = edicao;
        this.numFolhas = numFolhas;
        this.emprestimo = emprestimo;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public int getNumFolhas() {
        return numFolhas;
    }
    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }
    public boolean isEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public void abrirLivro(){
        System.out.println("Livro está aberto para leitura");
    }

    public void fecharLivro(){
        System.out.println("Livro está fechado para leitura");
    }

    public void visualizarObra(Livro livro){
        System.out.println("Lendo livro");
    }
    

}
