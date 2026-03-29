package services;
import models.Emprestimo;
import models.Livro;

public class EmprestimoService {

    public void realizarEmprestimo(Emprestimo emprestimo) {


        System.out.println("Empréstimo realizado com sucesso para: "+ emprestimo.getUsuario());
    }
}