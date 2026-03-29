import models.Aluno;
import models.Livro;
import repositories.BancoDeDados;
import services.FuncionarioService;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- BEM-VINDO AO SISTEMA DA BIBLIOTECA ---");

        // PASSO 1: Comprar o armário (Criar o banco de dados)
        BancoDeDados banco = new BancoDeDados();

        // PASSO 2: Contratar o funcionário e dar a chave do armário para ele
        FuncionarioService funcionarioService = new FuncionarioService(banco);

        // PASSO 3: Criar um aluno de verdade usando nosso "molde"
        // (ID, CPF, Nome, Telefone, Email, Matricula)
        Aluno aluno1 = new Aluno(1, "111.222.333-44", "João da Silva", 99998888, "joao@email.com", "RA12345");

        // Vamos criar um aluno com erro de propósito para testar a nossa regra!
        Aluno alunoComErro = new Aluno(2, "", "Maria Sem CPF", 77776666, "maria@email.com", "RA99999");

        // PASSO 4: Criar um livro de verdade
        // (ID, Titulo, ISBN, Autor)
        Livro livro1 = new Livro(1, "Código Limpo", "978-85-11", "Robert C. Martin");

        // PASSO 5: Mandar o funcionário trabalhar (Cadastrar)
        System.out.println("\nIniciando os cadastros...");
        funcionarioService.cadastrarAluno(aluno1);
        funcionarioService.cadastrarAluno(alunoComErro); // Vai dar o erro da regra!
        funcionarioService.cadastrarLivro(livro1);

        // PASSO 6: Verificar se salvou mesmo
        int totalItens = banco.getAcervo().size();
        System.out.println("\nResumo do dia: Temos " + totalItens + " item(ns) no acervo.");
    }
}