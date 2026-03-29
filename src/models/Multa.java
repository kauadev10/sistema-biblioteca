package models;

public class Multa {
    private int id;
    private float valor;
    private String status;

    public Multa(int id, float valor) {
        this.id = id;
        this.valor = valor;
        this.status = "Pendente";
    }
}