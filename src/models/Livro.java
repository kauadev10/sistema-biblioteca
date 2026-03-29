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

    //GETTERS E SETTERS
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}