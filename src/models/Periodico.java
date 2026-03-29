package models;

public class Periodico extends ItemAcervo {
    private int edicao;

    public Periodico(int id, String titulo, int edicao) {
        super(id, titulo); // Manda ID e Titulo para o Pai (ItemAcervo)
        this.edicao = edicao;
    }
}