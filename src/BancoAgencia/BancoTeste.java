package BancoAgencia;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

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

        ArrayList<Agencia> agencias = banco1.getAgencias();
        assertEquals(3, agencias.size());
        assertEquals(ag1, banco1.getAgencia(0));
        assertEquals(ag2, banco1.getAgencia(1));
        assertEquals(ag3, banco1.getAgencia(2));
    }
    @Test
    public void testeBanco2(){
        Banco banco2 = new Banco(456, "Banco Cooperativa");
        Agencia ag1 = new Agencia(1234, "Rio do Sul", 1982);
        Agencia ag2 = new Agencia(5678, "Blumenau", 2000);
        Agencia ag3 = new Agencia(8594, "Santo Amaro", 1996);
        banco2.addAgencia(ag1);
        banco2.addAgencia(ag2);
        banco2.addAgencia(ag3);

    }
}