package BancoAgencia;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BancoTeste {
    @Test
    public void testeBanco1() {
        Banco banco1 = new Banco(12, "Banco Brasil");
        Agencia ag1 = new Agencia(1234, "Ibirama", 1990);
        Agencia ag2 = new Agencia(5678, "Blumenau", 2010);
        Agencia ag3 = new Agencia(9012, "Ibirama", 2010);
        banco1.addAgencia(ag1);
        banco1.addAgencia(ag2);
        banco1.addAgencia(ag3);

        ArrayList<Agencia> agBanco1 = banco1.getAgencias();
        assertEquals(3, agBanco1.size());
        assertEquals(ag1, agBanco1.get(0));
        assertEquals(ag2, agBanco1.get(1));
        assertEquals(ag3, agBanco1.get(2));



    }
    Banco banco2 = new Banco(456, "Banco Cooperativa");
    Agencia ag4 = new Agencia(1234, "Rio do Sul", 1982);
    Agencia ag5 = new Agencia(5678, "Blumenau", 2000);
}