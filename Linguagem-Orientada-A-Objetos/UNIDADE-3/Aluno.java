public class Aluno {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    //Métodos getters e setters para encapsulament
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome;}

    public int getMatricula(){ return matricula; }
    public void SetMatricula(int matricula){ this.matricula = matricula;}

    public double getNota(){ return nota;}
    public void setNota(double nota){
        if(nota >= 0 && nota <=10){
            this.nota = nota;
        }else{
            System.out.println("Nota invalida@! A nota deve estar entre 0 e 10!");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome do aluno: " + nome + ", Matricula: " + matricula + ", e Nota: " + nota);
    }

}
