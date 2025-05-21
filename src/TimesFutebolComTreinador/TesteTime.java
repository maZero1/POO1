package TimesFutebolComTreinador;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteTime {
    @Test
    public void testeVerificarTreinador(){
        Time PSG = new Time("PSG/SMU", 2013, "Ibirama-SC");
        Treinador Renato = new Treinador("135.449.569-18", "Renato", 16000);
        PSG.setTreinador(Renato);
        assertEquals(Renato, PSG.getTreinador());
    }
    @Test
    public void testeTrocarTreinador(){
        Time PSG = new Time("PSG/SMU", 2013, "Ibirama-SC");
        Treinador Renato = new Treinador("135.449.569-18", "Renato", 16.000);
        Treinador Eduardo = new Treinador("490.783.109.18", "Eduardo", 15.000);
        PSG.setTreinador(Renato);
        PSG.setTreinador(Eduardo);
        assertEquals(Eduardo, PSG.getTreinador());
    }
    @Test
    public void testeRepresentacaoTime(){
        Time PSG = new Time("PSG/SMU", 2013, "Ibirama-SC");
        Treinador Renato = new Treinador("135.449.569-18", "Renato", 16000);
        PSG.setTreinador(Renato);
        String representacaoTime = "Time: PSG/SMU, Fundacao: 2013, Sede: Ibirama-SC, Treinador: " +
                                   "CPF: 135.449.569-18, Nome: Renato, Salario Mensal: 16000.0";
        assertEquals(representacaoTime, PSG.toString());
    }
    @Test
    public void testeTime2(){
        Time Tupy = new Time("Tupy", 1980, "Rio do Sul");
        Treinador duda = new Treinador("672.198.653.02", "Duda", 10000);
        Tupy.setTreinador(duda);
        String represetacaoTime = "Time: Tupy, Fundacao: 1980, Sede: Rio do Sul, Treinador: " +
                                  "CPF: 672.198.653.02, Nome: Duda, Salario Mensal: 10000.0";
        assertEquals(represetacaoTime, Tupy.toString());
    }
    @Test
    public void testeAlteraTreinador(){
        Time Tupy = new Time("Tupy", 1980, "Rio do Sul");
        Treinador duda = new Treinador("672.198.653.02", "Duda", 10000);
        Treinador malao = new Treinador("135.449.569-18", "Marlon", 20000);
        Tupy.setTreinador(duda);
        Tupy.setTreinador(malao);
        assertEquals(malao, Tupy.getTreinador());
    }
}
