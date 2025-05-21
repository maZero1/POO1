package GeminiQuestions.Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int registro;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, int registro){
        this.nome = nome;
        this.registro = registro;
        this.livrosEmprestados = new ArrayList<>();
    }
    public String getNome(){
        return this.nome;
    }
    public int getRegistro(){
        return this.registro;
    }
    public void addLivrosEmprestados(Livro livro){
        if(livro != null){
            this.livrosEmprestados.add(livro);
            System.out.println("Livro " + getNome() + " adicionado aos emprestados");
        }else{
            System.out.println("Tentativa de adicionar livro nulo");
        }
    }
    public void removeLivrosEmprestados(String isbn){
        if(isbn == null || isbn.isEmpty()){
            System.out.println("ISBN inválido");
            return;
        }
        Livro livroParaRemover = null;
        for(Livro livro : this.livrosEmprestados){
            if(livro.getIsbn().equals(isbn)){
                livroParaRemover = livro;
                break;
            }else{
                System.out.println("Livro " + isbn + " não encontrado nos empréstimos");
            }
        }if(livroParaRemover != null){
            this.livrosEmprestados.remove(livroParaRemover);
            System.out.println("Livro '" + livroParaRemover.getTitulo() + "' (ISBN: " + isbn + ") removido dos empréstimos de " + this.nome + ".");
        }else{
            System.out.println("Livro com ISBN '" + isbn + "' não encontrado nos empréstimos de " + this.nome + ".");
        }
    }
    //Ler melhor esses dois metodos
    public void listarLivrosEmprestados() {
        System.out.println("\n--- Livros Emprestados por " + this.nome + " (Registro: " + this.registro + ") ---");
        if (this.livrosEmprestados.isEmpty()) { // Verifica se a lista está vazia
            System.out.println("Nenhum livro emprestado no momento.");
        } else {
            for (Livro livro : this.livrosEmprestados) { // Loop for-each para percorrer a lista
                System.out.println("- Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", ISBN: " + livro.getIsbn());
            }
        }
        System.out.println("----------------------------------------------");
    }
    public boolean possuiLivro(String isbn) {
        if (isbn == null || isbn.isEmpty()) {
            return false; // ISBN inválido
        }
        for (Livro livro : this.livrosEmprestados) {
            if (livro.getIsbn().equals(isbn)) {
                return true; // Encontrou o livro na lista do usuário
            }
        }
        return false; // Não encontrou o livro na lista do usuário
    }

}
