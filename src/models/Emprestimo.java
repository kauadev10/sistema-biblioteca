package models;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Emprestimo {
    private int id;
    private Date dataRetirada;
    private Date dataDevolucaoPrevista;

    private Pessoa usuario;
    private List<ItemAcervo> itens;
    private Multa multa;

    // Construtor
    public Emprestimo(int id, Pessoa usuario, Date dataDevolucaoPrevista) {
        this.id = id;
        this.usuario = usuario;
        this.dataRetirada = new Date();
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.itens = new ArrayList<>();
        this.multa = null;
    }

    public void adicionarItem(ItemAcervo item) {
        this.itens.add(item);
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }
}