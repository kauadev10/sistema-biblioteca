package models;
import java.util.Date;

public class Livro extends ItemAcervo {
    private String isbn;
    private String autor;
    private Date dataLancamento;

    public Livro(int id, String titulo, String isbn, String autor) {
        super(id, titulo);
        this.isbn = isbn;
        this.autor = autor;
    }

    // ... getters e setters do ISBN e Autor
}