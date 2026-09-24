abstract class Pessoa {
    
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract void apresentar();
}

//class Aluno extends Pessoa{
//
//    private int matricula;
//
//    public Aluno(String nome, int matricula) {
//        super(nome);
//        this.matricula = matricula;
//    }
//
//    @Override
//    public void apresentar(){
//        System.out.println("Olá, meu nome é " + nome + " e minha matrícula é " + matricula);
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//        Aluno aluno = new Aluno("Pedro", 12345);
//        aluno.apresentar();
//    }
//}