package FeitasEmSala.ArrayInteiros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ArrayInteirosTeste {

    @Test
    public void testeArrayInteiros() {
        ArrayInteiros tamanhoArray = new ArrayInteiros(10);
        int[] valoresInserir = new int[]{12, 99, 10, 38, 19, 55, 18, 49, 10, 100};
        ArrayInteiros array = new ArrayInteiros(10);
    }
    @Test //Testa o Setter index, vendo possíveis soluções verdadeiras
        public void testeSetterIndexValido(){
        ArrayInteiros array = new ArrayInteiros(99);
        boolean inseriu = array.setValor(40, 10);
        assertTrue(inseriu);
        inseriu = array.setValor(30, 70);
        assertTrue(inseriu);
    }
    @Test //Testa o Setter index, vendo possíveis soluções falsas
        public void testeSetterIndexInvalido(){
        ArrayInteiros array = new ArrayInteiros(99);
        boolean inseriu = array.setValor(101, 40);
        assertFalse(inseriu, "Valor de indice acima do limite");
        inseriu = array.setValor(100, 1400);
        assertFalse(inseriu, "Valor inserido acima do limite");
        assertNotEquals(false, 80);
        assertFalse(inseriu, "Valor inserido abaixo do limite");
    }
    @Test //Aqui ele testa se o get dos valores indexados funciona
        public void testeGetterIndex(){
        int tamanhoArray = 10;
        int[] valoresAInserir = new int[]{12, 99, 1, 7, 1, 4, 3, 5, 8, 3};
        ArrayInteiros array = new ArrayInteiros(tamanhoArray);
        for (int i = 0; i < valoresAInserir.length; i++)
            assertEquals(true, array.setValor(i, valoresAInserir[i]), "Número negativo inserido");
    }
    @Test //Testa de o GetArray funciona
        public void testeGetterArray(){
        int tamanhoArray = 10;
        int[] valoresAInserir = new int[]{12, 99, 1, 7, 1, 4, 3, 5, 8, 3};
        ArrayInteiros array = new ArrayInteiros(tamanhoArray);
        for (int i = 0; i < valoresAInserir.length; i++)
            assertEquals(true, array.setValor(i, valoresAInserir[i]));
        assertArrayEquals(valoresAInserir, array.getArrayInteiros());
    }
    @Test //Testa o metodo maior
        public void testeMaiorValor(){
        int tamanhoArray = 10;
        int[] valoresAInserir = new int[]{12, 99, 1, 7, 1, 4, 3, 5, 8, 3};
        ArrayInteiros array = new ArrayInteiros(tamanhoArray);
        for (int i = 0; i < valoresAInserir.length; i++)
            assertEquals(true, array.setValor(i, valoresAInserir[i]));
        assertEquals(99, array.maior());
    }
    @Test
    public void testeFrequencia(){
        int tamanhoArray = 10;
        int[] valoresAInserir = new int[]{12, 99, 1, 7, 1, 4, 3, 99, 8, 3};
        ArrayInteiros array = new ArrayInteiros(tamanhoArray);
        for (int i = 0; i < valoresAInserir.length; i++)
            assertTrue(array.setValor(i, valoresAInserir[i]));
        int[] arrayGabarito = new int[101]; //sabendo que o array de inteiros primitivos é iniciado com 0 em todas as posições;
        arrayGabarito[1]  = 2; //numero 01 aparece 2 vezes
        arrayGabarito[3]  = 2; //numero 03 aparece 2 vezes
        arrayGabarito[4]  = 1; //numero 04 aparece 1 vez
        arrayGabarito[5]  = 0; //numero 05 aparece 1 vez
        arrayGabarito[7]  = 1; //numero 07 aparece 1 vez
        arrayGabarito[8]  = 1; //numero 08 aparece 1 vez
        arrayGabarito[12] = 1; //numero 12 aparece 1 vez
        arrayGabarito[99] = 2; //numero 99 aparece 1 vez
        assertArrayEquals(arrayGabarito, array.frequenciaAbsoluta());
    }
    @Test
        public void testeOrdenar(){
        int tamanhoArray = 10;
        int[] valoresAInserir = new int[]{12, 99, 1, 7, 1, 4, 3, 5, 8, 3};
        ArrayInteiros array = new ArrayInteiros(tamanhoArray);
        for (int i = 0; i < valoresAInserir.length; i++)
            assertTrue(array.setValor(i, valoresAInserir[i]));
        String arrayOrdenado = "1,1,3,3,4,5,7,8,12,99";
        array.ordenar();
        assertEquals(arrayOrdenado, array.toString());
    }
    @Test
        public void testeContemValido(){
        int tamanhoArray = 4;
        int[] valoresAInserir = new int[]{12, 3, 80, 10};
        ArrayInteiros array = new ArrayInteiros(tamanhoArray);
        for (int i = 0;i < valoresAInserir.length;i++){
            assertTrue(array.setValor(i,valoresAInserir[i]));
        }
        assertEquals(array.contem(10), true);
        assertEquals(array.contem(80), true);
        assertEquals(array.contem(3), true);
    }
}
