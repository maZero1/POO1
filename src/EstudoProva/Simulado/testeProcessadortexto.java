package EstudoProva.Simulado;

import org.junit.Test;

public class testeProcessadortexto {
    @Test
    public void teste(){
        ProcessadorTexto proc1 = new ProcessadorTexto("Olá, tudo certo?");
        System.out.println("Conteúdo original: " + proc1.getConteudo());

        proc1.formatar();
        System.out.println(proc1.getConteudo());

        proc1.formatar(1);
        System.out.println(proc1.getConteudo());

        proc1.formatar(2);
        System.out.println(proc1.getConteudo());

        proc1.formatar(3);
        System.out.println(proc1.getConteudo());

        proc1.formatar("nn");
        System.out.println(proc1.getConteudo());
    }
}
