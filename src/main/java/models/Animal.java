package models;

public class Animal {
    public String nome;
    public String especie;
    public String tipoAlimento;

    public Animal(String nome, String especie, String tipoAlimento){
        this.nome = nome;
        this.especie = especie;
        this.tipoAlimento = tipoAlimento;

    }

    public String alimentar(){
        return String.format(" %s Comendo %s", this.nome, this.tipoAlimento);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", tipoAlimento='" + tipoAlimento + '\'' +
                '}';
    }
}
