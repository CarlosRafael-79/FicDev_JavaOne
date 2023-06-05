package daysix.Biblioteca.Principal;


import daysix.Biblioteca.Model.Livro;
import daysix.Biblioteca.Model.Usuario;
import daysix.Biblioteca.Service.BibliotecaService;
import java.util.List;
import java.util.Scanner;

public class App {
    private static BibliotecaService bibliotecaService = new BibliotecaService();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.print(String.format("%n%n" + "_____ Biblioteca _____" + "%n%n"));
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Realizar empréstimo");
            System.out.println("4 - Realizar devolução");
            System.out.println("5 - Listar livros");
            System.out.println("6 - Listar usuários");
            System.out.println("7 - Buscar livro");
            System.out.println("8 - Buscar usuário");
            System.out.println("0 - Sair");
            System.out.print(String.format("%n" + "Digite a opção desejada: "));
            opcao = scanner.nextInt();
            switch(opcao) {
                case 1 -> cadastrarLivro();
                case 2 -> cadastrarUsuario();
                case 3 -> realizarEmprestimo();
                case 4 -> realizarDevolucao();
                case 5 -> listarLivros();
                case 6 -> listarUsuarios();
                case 7 -> buscarLivro();
                case 8 -> buscarUsuario();
                case 0 -> opcao = 0;
            }
        }
    }
    
    private static void cadastrarLivro() {
        System.out.println(String.format("%n" + "Cadastro de livro" + "%n"));
        scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        Livro livro = new Livro(titulo, autor);
        bibliotecaService.cadastrarLivro(livro);
        System.out.println("Livro cadastrado com sucesso.");
    }
    
    private static void cadastrarUsuario() {
        System.out.println(String.format("%n" + "Cadastro de usuário" + "%n"));
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();
        Usuario usuario = new Usuario(nome, email, telefone);
        bibliotecaService.cadastrarUsuario(usuario);
        System.out.println("Usuário cadastrado com sucesso.");
    }
    
    private static void realizarEmprestimo() {
        System.out.println(String.format("%n" + "Empréstimo de livro" + "%n"));
        System.out.print("ID do livro: ");
        int idLivro = scanner.nextInt();
        System.out.print("ID do usuário: ");
        int idUsuario = scanner.nextInt();
        try {
            bibliotecaService.realizarEmprestimo(idLivro, idUsuario);
            System.out.println("Empréstimo realizado com sucesso.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void realizarDevolucao() {
        System.out.println(String.format("%n" + "Devolução de livro" + "%n"));
        System.out.print("ID do livro: ");
        int idLivro = scanner.nextInt();
        System.out.print("ID do usuário: ");
        int idUsuario = scanner.nextInt();
        try {
            bibliotecaService.realizarDevolucao(idLivro, idUsuario);
            System.out.println("Devolução realizada com sucesso.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void listarLivros() {
        System.out.println(String.format("%n" + "Lista de livros" + "%n"));
        List<Livro> livros = bibliotecaService.listarLivros();
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
    
    private static void listarUsuarios() {
        System.out.println(String.format("%n" + "Lista de usuários" + "%n"));
        List<Usuario> usuarios = bibliotecaService.listarUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
    
    private static void buscarLivro() {
        System.out.println(String.format("%n" + "Busca de livro" + "%n"));
        System.out.print("ID do livro: ");
        int id = scanner.nextInt();
        Livro livro = bibliotecaService.buscarLivro(id);
        if (livro != null) {
            System.out.println(livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
    
    private static void buscarUsuario() {
        System.out.println(String.format("%n" + "Busca de usuário" + "%n"));
        System.out.print("ID do usuário: ");
        int id = scanner.nextInt();
        Usuario usuario = bibliotecaService.buscarUsuario(id);
        if (usuario != null) {
            System.out.println(usuario);
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
