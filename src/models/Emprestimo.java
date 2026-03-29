package models;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class Emprestimo {
    private int id;
    private Pessoa usuario;
    private List<ItemAcervo> itens;
    private Date dataRetirada;

    public Emprestimo(int id, Pessoa usuario) {
        this.id = id;
        this.usuario = usuario;
        this.itens = new ArrayList<>();
        this.dataRetirada = new Date();
    }

    //GETTERS E SETTERS

    public Pessoa getUsuario() {
        return usuario;
    }

    //metodo para aicionar coisas na sacola
    public void adicionarItem(ItemAcervo item) {
        this.itens.add(item);
    }
}