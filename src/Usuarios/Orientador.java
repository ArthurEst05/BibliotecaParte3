package Usuarios;

import java.io.Serializable;

public class Professor extends Usuarios implements Serializable{
    private static final long serialVersionUID = 1L;

    private String disciplina;
    private String grauAcademico;

    
    public Professor(String nome, String senha) {
        super(nome, senha);
    }


    public Professor(String nome, int idade, String sexo, String telefone, String senha) {
        super(nome, idade, sexo, telefone, senha);
    }

    public Professor(String nome, int idade, String sexo, String telefone, String disciplina, String grauAcademico, String senha) {
        super(nome, idade, sexo, telefone, senha);
        this.disciplina = disciplina;
        this.grauAcademico = grauAcademico;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getGrauAcademico() {
        return grauAcademico;
    }
    public void setGrauAcademico(String grauAcademico) {
        this.grauAcademico = grauAcademico;
    }


 @Override
    public String getTipo() {
        return "Professor";
    }
    
    @Override
    public String toString() {
        return "Professor [disciplina=" + disciplina + ", grauAcademico=" + grauAcademico + ", getId()=" + getId()
                + ", getNome()=" + getNome() + ", getDisciplina()=" + getDisciplina() + ", getIdade()=" + getIdade()
                + ", getGrauAcademico()=" + getGrauAcademico() + ", getSexo()=" + getSexo() + ", getTelefone()="
                + getTelefone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    

}
