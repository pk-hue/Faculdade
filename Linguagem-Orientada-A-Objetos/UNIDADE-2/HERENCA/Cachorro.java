package HERENCA;

public class Cachorro extends Animal implements Treinavel{
    @Override 
    public void falar(){
        System.out.println("O cachorro está latindo");
    }

    @Override
    public void executarComando(String comando) {
       System.out.println("O cachorro está executando o comando: " + comando);
    }
}
