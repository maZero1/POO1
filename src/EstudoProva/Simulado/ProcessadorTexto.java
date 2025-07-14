package EstudoProva.Simulado;

public class ProcessadorTexto {
    private String conteudo;

    public ProcessadorTexto(String textoInicial){
        this.conteudo = textoInicial;
    }
    public void formatar(){
        this.conteudo = this.conteudo.toUpperCase();
        System.out.println("Conteúdo formatado (MAIÚSCULAS): " + this.conteudo);
    }
    public void formatar(int tipo){
        if(tipo == 1){
            this.conteudo = this.conteudo.toUpperCase();
            System.out.println("Conteúdo formatado (MAIÚSCULAS): " + this.conteudo);
        }else if(tipo == 2){
            this.conteudo = this.conteudo.toLowerCase();
            System.out.println("Conteúdo formatado (minúsculas): " + this.conteudo);
        }else{
            System.out.println("Tipo de formatação inválido");
        }
    }
    public void formatar(String prefixo){
        String novoConteudo = prefixo + this.conteudo;
        System.out.println("Conteúdo formatado (com prefixo): " + novoConteudo);
    }
    public String getConteudo(){
        return this.conteudo;
    }
}
