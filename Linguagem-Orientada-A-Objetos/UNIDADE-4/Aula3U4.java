import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class ListaDeNomes{
    private ArrayList<String> nomes = new ArrayList<>();

    public void inserirNome(String nome){
        if(nomes.contains(nome)){
            System.out.println("Nome ja existente");
        }
        nomes.add(nome);
    }

    public void removerNome(String nome){
        if(nomes.contains(nome)){
            nomes.remove(nome);
        }else{
            System.out.println("Nome nao existente");
        }

    }

    public boolean existeNome(String nome){
        return nomes.contains(nome);
    }

    public void listarNomes(){
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}

public class Aula3U4 {
    public static void main() {
        System.out.println("-- Array de nomes --");

        ListaDeNomes listaDeNomes = new ListaDeNomes();

        listaDeNomes.inserirNome("Pedro");
        listaDeNomes.inserirNome("Maria");
        listaDeNomes.inserirNome("Rodrigo");
        listaDeNomes.listarNomes();

        System.out.println(listaDeNomes.existeNome("Pedro"));
        listaDeNomes.removerNome("Pedro");
        listaDeNomes.listarNomes();
    }
}
