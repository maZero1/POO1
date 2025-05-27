package GeminiQuestions.Biblioteca;

import java.util.*;

public class Biblioteca {
    private String nome;
    private List<Livro> acervo;
    private List<Usuario> usuarios;

    public Biblioteca(List acervo, List usuarios){
        this.acervo = acervo;
        this.usuarios = usuarios;
    }
    public void addLivro(Livro livro){
        if(livro != null){
            if (buscarLivro(livro.getIsbn()) == null){
                this.acervo.add(livro);
                System.out.println("Usuario '" + livro.getTitulo() + "' adicionado ao acervo");
            }else{
                System.out.println("Livro com ISBN " + livro.getIsbn() + " já existe no acervo");
            }
        }else{
            System.out.println("Não foi possível adicionar um livro nulo");
        }
    }
    public void removeLivro(String isbn){
        if(isbn == null){
            System.out.println("ISBN inválido para remoção");
        }
        Livro livroParaRemover = buscarLivro(isbn);
        if (livroParaRemover != null){
            this.acervo.remove(livroParaRemover);
            System.out.println("Livro '" + livroParaRemover.getTitulo() + "' (ISBN: " + isbn + ") removido do acervo.");
        }else{
            System.out.println("Livro com ISBN " + livroParaRemover.getTitulo() + " não encontrado");
        }
    }
    public void addUsuario(Usuario usuario){
        if(usuario != null){
            if(buscarUsuario(usuario.getRegistro()) == null){
                this.usuarios.add(usuario);
                System.out.println("Usuario "+ usuario.getNome() + " adicionado");
            }else{
                System.out.println("Usuario " + usuario.getNome() + " já existe");
            }
        }else{
            System.out.println("Não é possível adicionar um usuario nulo");
        }
    }
    public void removeUsuario(int registro){
        Usuario usuarioParaRemover = buscarUsuario(registro);
        if(usuarioParaRemover != null){
            this.usuarios.remove(usuarioParaRemover);
            System.out.println("Usuario "+ usuarioParaRemover.getNome() + " removido");
        }else{
            System.out.println("Usuario "+ registro + " não encontrado");
        }
    }
    public Usuario buscarUsuario(int registro){
        for(Usuario usuario : this.usuarios){
            if (usuario.getRegistro() == registro){
                return usuario;
            }
        }
        return null;
    }
    public Livro buscarLivro(String isbn) {
        if (isbn == null || isbn.isEmpty()) {
            return null;
        }
        for (Livro livro : this.acervo) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }
    public boolean emprestarLivro(String isbnLivro, int registroUsuario) {
        Livro livro = buscarLivro(isbnLivro);
        Usuario usuario = buscarUsuario(registroUsuario);
        if (livro == null) {
            System.out.println("Erro: Livro com ISBN '" + isbnLivro + "' não encontrado na biblioteca.");
            return false;
        }
        if (usuario == null) {
            System.out.println("Erro: Usuário com registro '" + registroUsuario + "' não encontrado.");
            return false;
        }
        if (!livro.isDisponivel()) {
            System.out.println("Erro: Livro '" + livro.getTitulo() + "' já está emprestado.");
            return false;
        }
        if (usuario.possuiLivro(isbnLivro)) {
            System.out.println("Erro: Usuário '" + usuario.getNome() + "' já possui o livro '" + livro.getTitulo() + "'.");
            return false;
        }
        if (livro.emprestar()) {
            usuario.addLivrosEmprestados(livro);
            System.out.println("Sucesso: Livro '" + livro.getTitulo() + "' emprestado para '" + usuario.getNome() + "'.");
            return true;
        } else {
            System.out.println("Erro inesperado ao emprestar o livro.");
            return false;
        }
    }
    public boolean devolverLivro(String isbnLivro, int registroUsuario) {
        Livro livro = buscarLivro(isbnLivro);
        Usuario usuario = buscarUsuario(registroUsuario);

        if (livro == null) {
            System.out.println("Erro: Livro com ISBN '" + isbnLivro + "' não encontrado na biblioteca.");
            return false;
        }
        if (usuario == null) {
            System.out.println("Erro: Usuário com registro '" + registroUsuario + "' não encontrado.");
            return false;
        }
        if (!usuario.possuiLivro(isbnLivro)) {
            System.out.println("Erro: Livro '" + livro.getTitulo() + "' não está emprestado a '" + usuario.getNome() + "'.");
            return false;
        }
        if (livro.isDisponivel()) {
            System.out.println("Erro: Livro '" + livro.getTitulo() + "' já está disponível (não estava emprestado).");
            return false;
        }
        usuario.removeLivrosEmprestados(isbnLivro);
        livro.devolver();
        System.out.println("Sucesso: Livro '" + livro.getTitulo() + "' devolvido por '" + usuario.getNome() + "'.");
        return true;
    }
    public void listarLivrosDisponiveis() {
        System.out.println("\n--- Livros Disponíveis no Acervo da " + this.nome + " ---");
        boolean encontrado = false;
        for (Livro livro : acervo) {
            if (livro.isDisponivel()) {
                System.out.println("- Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", ISBN: " + livro.getIsbn());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro disponível no momento.");
        }
        System.out.println("----------------------------------------------");
    }
    public void listarTodosOsLivros() {
        System.out.println("\n--- Todos os Livros no Acervo da " + this.nome + " ---");
        if (acervo.isEmpty()) {
            System.out.println("O acervo está vazio.");
            return;
        }
        for (Livro livro : acervo) {
            String status = livro.isDisponivel() ? "Disponível" : "Emprestado";
            System.out.println("- Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", ISBN: " + livro.getIsbn() + " (Status: " + status + ")");
        }
        System.out.println("----------------------------------------------");
    }
    public void listarUsuarios() {
        System.out.println("\n--- Usuários Cadastrados na " + this.nome + " ---");
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        for (Usuario usuario : usuarios) {
            System.out.println("- Nome: " + usuario.getNome() + ", Registro: " + usuario.getRegistro());
        }
        System.out.println("----------------------------------------------");
    }
}