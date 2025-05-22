package GeminiQuestions.Biblioteca;

import java.util.List;

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

    public Livro buscarLivro(String isbn) {
        if (isbn == null || isbn.isEmpty()) {
            return null;
        }
        for (Livro livro : this.acervo) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null; // Livro não encontrado
    }

}
