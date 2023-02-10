package models;

public class Tigre extends Animal {

    public Tigre(String nome, String especie, String tipoAlimento){
        super(nome, especie, tipoAlimento);
    }

    @Override
    public String alimentar() {
        return String.format("%s Comendo %s ",this.nome, this.tipoAlimento);
    }
}
