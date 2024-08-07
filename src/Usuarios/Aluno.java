package Usuarios;

import java.io.Serializable;

public class Estudante extends Usuarios implements Serializable{
    private static final long serialVersionUID = 1L;

    private String instituicaoEducacional;
    private String matricula;

    public Estudante(String nome, int idade, String sexo, String telefone, String senha) {
        super(nome, idade, sexo, telefone, senha);
    }

   

    public Estudante(String nome, String senha) {
        super(nome, senha);
    }



    public Estudante(String nome, int idade, String sexo, String telefone, String instituicaoEducacional,
                     String matricula, String senha) {
        super(nome, idade, sexo, telefone, senha);
        this.instituicaoEducacional = instituicaoEducacional;
        this.matricula = matricula;
    }
    
    public String getInstituicaoEducacional() {
        return instituicaoEducacional;
    }
    public void setInstituicaoEducacional(String instituicaoEducacional) {
        this.instituicaoEducacional = instituicaoEducacional;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
      public String getTipo() {
        return "Estudante";
    }

    @Override
    public String toString() {
        return "Estudante [instituicaoEducacional=" + instituicaoEducacional + ", matricula=" + matricula + ", getId()="
                + getId() + ", getNome()=" + getNome() + ", getInstituicaoEducacional()=" + getInstituicaoEducacional()
                + ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo() + ", getMatricula()=" + getMatricula()
                + ", getTelefone()=" + getTelefone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    
    
}
