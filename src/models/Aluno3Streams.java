package models;

public class Aluno3Streams {
    private String matricula;
    private String nomeAluno;

    public Aluno3Streams(String matricula, String nomeAluno) {
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }


    @Override
    public String toString() {
        return "Aluno3Streams{" +
                "matricula='" + matricula + '\'' +
                ", nomeAluno='" + nomeAluno + '\'' +
                '}';
    }
}
