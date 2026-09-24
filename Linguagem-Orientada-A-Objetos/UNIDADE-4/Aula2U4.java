import java.util.ArrayList;
import java.util.Arrays;

class GerenciadorArray{
    private int[] array;
    private int tamanho;

    public GerenciadorArray(int capacidade){
        array = new int[capacidade];
        tamanho = 0;
    }

    public void inserir(int valor){
        if(tamanho < array.length){
            array[tamanho++] = valor;
        }
    }

    public void remover(int valor){
        for(int i = 0; i < tamanho; i++){
            if(array[i] == valor){
                array[i] = array[tamanho - 1];
                tamanho--;
                return;
            }
        }
    }

    public boolean pesquisar(int valor){
        for(int i = 0; i < tamanho; i++){
            if(array[i] == valor){
                return true;
            }
        }
        return false;
    }

    public void exibir(){
        System.out.println(Arrays.toString(Arrays.copyOf(array, tamanho)));
    }

}

public class Aula2U4 {
    public static void main(String[] args) {
        System.out.println("Tipos de arrays");

        GerenciadorArray g = new GerenciadorArray(5);
        g.inserir(1);
        g.inserir(2);
        g.inserir(3);
        g.inserir(4);
        g.exibir();
        System.out.println("Pesquisa do numero 1: " + g.pesquisar(1));
    }
}
