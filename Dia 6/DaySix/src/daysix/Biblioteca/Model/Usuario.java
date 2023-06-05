package daysix.Biblioteca.Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private int telefone;
    private int emprestimos;
    private List<Livro> livrosEmprestados = new ArrayList<>();
    
    public Usuario(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.emprestimos = 0;
    }

    @Override
    public String toString() {
        return "Usuario(" + "ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Telefone: " + telefone + ", Emprestimos: "
                + emprestimos + ", Títulos Emprestados: " + livrosEmprestados + ')';
    }
    
    
    
    public int getQtdLivrosEmprestados() {
        return emprestimos;
    }
    public boolean getPossuiVaga() {
        return emprestimos < 3;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        emprestimos++;
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
        emprestimos--;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
