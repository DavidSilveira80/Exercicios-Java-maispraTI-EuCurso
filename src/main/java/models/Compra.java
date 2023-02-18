package models;

public class Compra {
    private String dataCompra;
    private String descricao;

    public Compra(String dataCompra, String descricao) {
        this.dataCompra = dataCompra;
        this.descricao = descricao;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
