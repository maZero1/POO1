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
        return null; // Livro não encontrado
    }

}
