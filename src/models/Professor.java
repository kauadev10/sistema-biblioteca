package models;

public class Professor extends Pessoa {
    private String departamento;

    public Professor(int id, String cpf, String nome, int telefone, String email, String departamento) {
        super(id, cpf, nome, telefone, email); // Chama o Pai
        this.departamento = departamento;
    }
}