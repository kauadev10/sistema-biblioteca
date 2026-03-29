package repositories;

import java.util.ArrayList;
import java.util.List;
import models.Pessoa;
import models.ItemAcervo;

public class BancoDeDados {

    private List<Pessoa> pessoasCadastradas = new ArrayList<>();
    private List<ItemAcervo> acervoCadastrado = new ArrayList<>();

    public void salvarPessoa(Pessoa pessoa) {
        this.pessoasCadastradas.add(pessoa);
    }

    public void salvarItem(ItemAcervo item) {
        this.acervoCadastrado.add(item);
    }

    // Olhar oque tem na lista
    public List<ItemAcervo> getAcervo() {
        return acervoCadastrado;
    }
}