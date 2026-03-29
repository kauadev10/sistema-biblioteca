package models;

public class Aluno extends Pessoa {
    private String matriculaRA;

    // Construtor do Aluno
    public Aluno(int id, String cpf, String nome, int telefone, String email, String matriculaRA) {
        // Manda os dados básicos lá para o construtor do Pai (Pessoa)
        super(id, cpf, nome, telefone, email);

        // Salva o dado que é só do Aluno
        this.matriculaRA = matriculaRA;
    }
}