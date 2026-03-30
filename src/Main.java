import models.Aluno;
import models.Livro;
import models.Pessoa;
import models.Professor;
import repositories.BancoDeDados;
import services.FuncionarioService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoDeDados banco = new BancoDeDados();
        FuncionarioService funcionarioService = new FuncionarioService(banco);

        String user = "admin";
        int senha = 1234;

        System.out.println("--- BEM-VINDO A BIBLIOTECA ---");

        System.out.println("Digite o user: ");
        String userDigitado = scanner.nextLine();

        System.out.println("Digite a senha: ");
        int senhaDigitada = scanner.nextInt();

        scanner.nextLine();

        if (userDigitado.equals(user) && senhaDigitada == senha) {
            System.out.println("\nLogin aprovado! --- BEM-VINDO AO PAINEL ADMIN ---");

            boolean executando = true;

            while (executando) {
                System.out.println("\nO que você deseja fazer?");
                System.out.println("1 - Cadastrar novo Aluno");
                System.out.println("2 - Cadastrar novo Livro");
                System.out.println("3 - Ver total de itens no Acervo");
                System.out.println("4 - Mostrar Alunos cadastrados");
                System.out.println("5 - Mostrar Professores cadastrados");
                System.out.println("0 - Sair do sistema");
                System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("\n-- CADASTRANDO ALUNO --");
                        System.out.print("Digite o ID: ");
                        int idAluno = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o CPF: ");
                        String cpf = scanner.nextLine();

                        System.out.print("Digite o Nome: ");
                        String nomeAluno = scanner.nextLine();

                        System.out.print("Digite o Telefone (Apenas números): ");
                        int telefone = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o E-mail: ");
                        String email = scanner.nextLine();

                        System.out.print("Digite a Matrícula (RA): ");
                        String ra = scanner.nextLine();

                        //criando o aluno
                        Aluno novoAluno = new Aluno(idAluno, cpf, nomeAluno, telefone, email, ra);
                        funcionarioService.cadastrarAluno(novoAluno);
                        break;

                    case 2:
                        System.out.println("\n-- CADASTRANDO LIVRO --");
                        System.out.print("Digite o ID: ");
                        int idLivro = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o Título: ");
                        String titulo = scanner.nextLine();

                        System.out.print("Digite o ISBN: ");
                        String isbn = scanner.nextLine();

                        System.out.print("Digite o Autor: ");
                        String autor = scanner.nextLine();

                        Livro novoLivro = new Livro(idLivro, titulo, isbn, autor);
                        funcionarioService.cadastrarLivro(novoLivro);
                        break;

                    case 3:
                        int total = banco.getAcervo().size();
                        System.out.println("\nAtualmente temos " + total + " item(ns) no acervo.");
                        break;

                    case 4:
                        System.out.println("\n-- LISTA DE ALUNOS --");
                        for (Pessoa pessoa : banco.getPessoas()) {
                            if (pessoa instanceof Aluno) {
                                System.out.println("- Nome: " + pessoa.getNome() + " | CPF: " + pessoa.getCpf());
                            }
                        }
                        break;

                    case 5:
                        System.out.println("\n-- LISTA DE PROFESSORES --");
                        for (Pessoa pessoa : banco.getPessoas()) {
                            if (pessoa instanceof Professor) {
                                System.out.println("- Nome: " + pessoa.getNome() + " | CPF: " + pessoa.getCpf());
                            }
                        }
                        break;

                    case 0:
                        System.out.println("\nSaindo do sistema. Até logo!");
                        executando = false;
                        break;

                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                        break;
                }
            }
        } else {
            System.out.println("Usuário ou senha incorretos!");
        }

        scanner.close();
    }
}