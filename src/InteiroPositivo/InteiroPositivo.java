package InteiroPositivo;

public class InteiroPositivo {
    private int x;

    public int getValor(){
        return this.x;
    }
    public boolean setValor(int x){
        if(x >= 0){
            this.x = x;
            return true;
        }else{
            return false;
        }
    }
    public boolean ehImpar(){
        if(x % 2 != 0){
            return true;
        }else{
            return false;
        }
    }
    public int[] getDivisores(){
        int quantidadeDivisores = 0;
        for(int divisor = x;divisor > 0;divisor--){
            if(x % divisor == 0){
                quantidadeDivisores++;
            }
        }
        int[] divisores = new int[quantidadeDivisores];
        int i = 0;
        for(int divisor = x; divisor > 0; divisor--){
            if (x % divisor == 0){
                divisores[i] = divisor;
                i ++;
            }
        }
        return divisores;
    }
    public int fatorial(){
        return fat(x);
    }
    private int fat(int valor){
        if(valor == 0){
            return 1;
        }
        int resultado = valor;
        for(int i = valor-1; i > 0; i--){
            resultado = resultado * i;
        }
        return resultado;
    }
    public double h() {
        double resultado = 0;
        for(int valor = 1; valor <= x; valor++){
            resultado = resultado + 1/(double)valor;
        }
        return resultado;
    }
    public double p(){
        double resultado = 0;
        for(int termo = 1;termo <= x; termo++){
            if(termo % 2 == 0){
                resultado = resultado - (double) termo/(double) fat(termo*2);
            }else{
                resultado = resultado + (double) termo/(double) fat(termo*2);
            }
        }
        return resultado;
    }
    public double raizQuadrada(){
        return Math.sqrt(x);
    }
    @Override
    public String toString() {
        return String.valueOf(x);
    }
}
