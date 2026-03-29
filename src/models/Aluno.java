package models;

public class Aluno extends Pessoa {
    private String matriculaRA;


    public Aluno(int id, String cpf, String nome, int telefone, String email, String matriculaRA) {
        super(id, cpf, nome, telefone, email);

        this.matriculaRA = matriculaRA;
    }
}