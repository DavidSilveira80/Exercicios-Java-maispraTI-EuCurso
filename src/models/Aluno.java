package models;

public class Aluno {
    private String nomeAluno;
    private double nota1, nota2, nota3, media, maiorNota, menorNota, notasSomadas;


    public Aluno(){

    }


    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }


    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }


    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNotasSomadas() {
        return notasSomadas;
    }

    public double somarNotas(){

        return this.notasSomadas = this.nota1 + this.nota2 + this.nota3;
    }

    public void calcularMedia(){
        System.out.println("CALCULANDO A MÉDIA DO ALUNO " + this.nomeAluno + ".");
        this.media = this.notasSomadas / 3;
    }

    public double acharMaiorNota(){
        if(this.nota1 >= this.nota2 && this.nota1 >= this.nota3){
            this.maiorNota = this.nota1;
        }else if(this.nota2 >= this.nota1 && this.nota2 >= this.nota3){
            this.maiorNota = this.nota2;
        }else{
            this.maiorNota = this.nota3;
        }
        return this.maiorNota;
    }

    public double acharMenorNota(){
        if(this.nota1 <= this.nota2 && this.nota1 <= this.nota3){
            this.menorNota = this.nota1;
        }else if(this.nota2 <= this.nota1 && this.nota2 <= this.nota3){
            this.menorNota = this.nota2;
        }else{
            this.menorNota = this.nota3;
        }
        return this.menorNota;
    }

    public String mostrarBoletimAluno(){
        String saida = String.format("""
                   
                   BOLETIM ESCOLAR
                     ALUNO %s
                     MÉDIA: %.1f
                     MAIOR NOTA: %.1f
                     MENOR NOTA: %.1f     
                """,this.nomeAluno, this.media, this.maiorNota, this.menorNota);
        return saida;
    }
}
