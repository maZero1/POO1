package ArrayInteiros;

public class ArrayInteiros {
    private int array[];

    public ArrayInteiros(int tamanho){
        if(tamanho > 0){
            array = new int[tamanho];
        }
    }
    public boolean setValor(int indice, int valor){
        if(indice >= 0 && indice <= 100 && valor >= 0 && valor <=100){
            this.array[indice] = valor;
            return true;
        }else{
            return false;
        }
    }
    public int[] getArrayInteiros(){
        return this.array;
    }
    public String toString(){
        String texto = "";
        for(int i = 0;i < array.length;i++){
            texto += array[i];
            if(i <= array.length-1 && i != array.length-1){
                texto += ",";
            }
        }
        return texto;
    }
    public boolean contem(int valor){
        for(int i = 0; i <= array.length; i++){
            if(array[i] == valor){
                return true;
            }
        }
        return false;
    }
    public int maior(){
        int indexMaiorValor = 0;
        int maiorValor = array[0];
        for(int i = 0;i < array.length;i++){
            if(array[i] > maiorValor){
                maiorValor = array[i];
                indexMaiorValor = array[i];
            }
        }
        return indexMaiorValor;
    }
    public int[] frequenciaAbsoluta(){
        int[] frequencias = new int[101];
        for(int i = 0; i < array.length; i++){
            frequencias[array[i]]++;
        }
        return frequencias;
    }
    public void ordenar(){
        for(int passagem = 0; passagem < array.length;passagem++){
            for(int i = 0;i < array.length - 1;i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
