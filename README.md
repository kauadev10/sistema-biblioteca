# 📚 Sistema de Gerenciamento de Biblioteca Universitária

## 📖 Sobre o Projeto
Este projeto é um sistema de gerenciamento de biblioteca desenvolvido em **Java**, utilizando os pilares da **Programação Orientada a Objetos (POO)**. 

O sistema simula o controle de um acervo universitário em tempo real, permitindo o cadastro de usuários (Alunos e Professores) e itens (Livros, Revistas, Artigos). O objetivo principal foi criar um código limpo, escalável e seguro.

## ⚙️ Funcionalidades
- **Painel Administrativo:** Acesso restrito por sistema de login interativo (`user: admin` | `senha: 1234`).
- **Gestão de Usuários:** Cadastro e listagem separada de Alunos e Professores.
- **Gestão de Acervo:** Cadastro dinâmico de Livros (com validação de ISBN e Autores) e contagem total do acervo.
- **Menu Interativo:** Navegação contínua via console (terminal) utilizando estruturas de repetição (`while`) e seleção (`switch`).

## 🏗️ Arquitetura e Padrões de Projeto (Por que fiz assim?)
Para fugir do código amador onde tudo fica misturado em um arquivo só, o projeto foi estruturado em camadas. Essa escolha (similar ao padrão MVC) facilita a manutenção e a divisão de tarefas na equipe:

- **`/models` (Os Moldes):** Contém as entidades puras do sistema usando o princípio de **Encapsulamento** (atributos privados protegidos por Getters/Setters). 
  - Usamos **Herança** (`Pessoa` -> `Aluno`, `Professor`, `Funcionario`) para compartilhar atributos comuns como Nome e CPF.
  - Usamos **Polimorfismo** criando a superclasse abstrata `ItemAcervo`, permitindo que Livros, Artigos e Periódicos sejam guardados na mesma lista dinâmica.
- **`/repositories` (O Armazém):** Isolamos o armazenamento de dados na classe `BancoDeDados`. Atualmente rodando em memória RAM via `ArrayLists`, mas estruturado para facilitar uma futura conexão com bancos de dados reais (SQL) sem quebrar o resto do sistema.
- **`/services` (O Cérebro):** Onde vive a Inteligência do sistema (Regras de Negócio). O `FuncionarioService` centraliza o trabalho de cadastrar pessoas e itens, retirando essa responsabilidade da interface visual.
- **`Main.java` (A Tela):** Ponto de entrada limpo, focado apenas em interagir com o usuário e capturar dados pelo teclado via `Scanner`.

## 🚀 Como Executar o Projeto

1. Certifique-se de ter o **Java (JDK)** instalado na sua máquina.
2. Clone ou faça o download deste repositório.
3. Abra o projeto na sua IDE favorita (Eclipse, IntelliJ, VS Code, NetBeans, etc.).
4. Execute o arquivo `Main.java`.
5. No console, insira as credenciais de administrador:
   - **Usuário:** `admin`
   - **Senha:** `1234`
6. Utilize os números do menu para navegar e testar o sistema!
