package models;

public abstract class ItemAcervo {
    private int id;
    private String titulo;

    // Construtor
    public ItemAcervo(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
}