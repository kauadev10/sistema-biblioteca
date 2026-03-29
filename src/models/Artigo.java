package models;

public class Artigo extends ItemAcervo {
    private String doi;

    public Artigo(int id, String titulo, String doi) {
        super(id, titulo);
        this.doi = doi;
    }
}