package GeminiQuestions.Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn; //Id do livro
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public boolean isDisponivel(){
        return this.disponivel;
    }
    public boolean emprestar(){
        if(disponivel){
            this.disponivel = false;
            System.out.println("Livro " + titulo + " emprestado com sucesso");
            return true;
        }else{
            System.out.println("Livro " + titulo + " indisponivel no momento");
            return false;
        }
    }
    public void devolver(){
        if(!disponivel){
            this.disponivel = true;
            System.out.println("Livro " + titulo + " devolvido com sucesso");
        }else{
            System.out.println("Livro " + titulo + " ja está disponivel");
        }
    }
}
