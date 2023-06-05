package daysix.Biblioteca.Model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int publicacao;
    private boolean disponivel;
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    @Override
    public String toString() {
        return "Livro(" + "ID: " + id + ", Titulo: " + titulo + ", Autor: " + autor + ", Publicacao: " + publicacao + ", Disponivel: " + disponivel + ')';
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(int publicacao) {
        this.publicacao = publicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}