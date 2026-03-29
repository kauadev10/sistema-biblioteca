package services;

import models.Aluno;
import models.Livro;
import repositories.BancoDeDados;

public class FuncionarioService {

    private BancoDeDados banco;

    public FuncionarioService(BancoDeDados banco) {
        this.banco = banco;
    }

    // Ação 1: Cadastrar Aluno
    public void cadastrarAluno(Aluno aluno) {
        // Aqui ficam as regras! Exemplo: O CPF não pode ser vazio.
        if(aluno.getCpf().isEmpty()) {
            System.out.println("Erro: O aluno precisa ter um CPF!");
            return; // Para o processo aqui.
        }

        // Se a regra passou, guarda no armário.
        banco.salvarPessoa(aluno);
        System.out.println("Sucesso: Aluno " + aluno.getNome() + " cadastrado!");
    }

    // Ação 2: Cadastrar Livro
    public void cadastrarLivro(Livro livro) {
        banco.salvarItem(livro);
        System.out.println("Sucesso: Livro '" + livro.getTitulo() + "' adicionado ao acervo!");
    }
}