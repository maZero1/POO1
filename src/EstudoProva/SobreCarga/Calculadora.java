package EstudoProva.SobreCarga;

public class Calculadora {
    // Metodo somar com dois inteiros
    public int somar(int a, int b) {
        System.out.println("Somando dois inteiros...");
        return a + b;
    }
    // Metodo somar com três inteiros (sobrecarga)
    public int somar(int a, int b, int c) {
        System.out.println("Somando três inteiros...");
        return a + b + c;
    }
    // Metodo somar com dois doubles (sobrecarga)
    public double somar(double a, double b) {
        System.out.println("Somando dois doubles...");
        return a + b;
    }
    // Metodo somar com um array de inteiros (sobrecarga)
    public int somar(int[] numeros) {
        System.out.println("Somando array de inteiros...");
        int total = 0;
        for (int num : numeros) {
            total += num;
        }
        return total;
    }
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Resultado 1: " + calc.somar(5, 3));         // Chama somar(int, int)
        System.out.println("Resultado 2: " + calc.somar(5, 3, 2));      // Chama somar(int, int, int)
        System.out.println("Resultado 3: " + calc.somar(5.5, 3.2));     // Chama somar(double, double)
        System.out.println("Resultado 4: " + calc.somar(new int[]{1, 2, 3, 4})); // Chama somar(int[])
    }
}
