package EstudoProva.HerancaEVisibilidade.com.minhaempresa.filha;

import EstudoProva.HerancaEVisibilidade.com.minhaempresa.base.Pai;

public class Filho extends Pai {
    public void testarAcessos() {
        System.out.println("Acessando membros herdados:");
        System.out.println("Público: " + publico);       // OK
        System.out.println("Protegido: " + protegido);   // OK (subclasse em outro pacote)
        // System.out.println("Padrão: " + padrao);      // ERRO: não acessível (pacote diferente)
        // System.out.println("Privado: " + privado);    // ERRO: não acessível (privado)

        metodoPublico();    // OK
        metodoProtegido();  // OK
        // metodoPadrao();   // ERRO
        // metodoPrivado();  // ERRO

        // Acessando indiretamente um privado da superclasse
        acessarPrivado(); // OK, pois 'acessarPrivado' é público
    }

    public static void main(String[] args) {
        Filho filho = new Filho();
        filho.testarAcessos();
    }
}
