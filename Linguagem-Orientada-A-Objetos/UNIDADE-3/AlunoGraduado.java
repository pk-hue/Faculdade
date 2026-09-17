public class AlunoGraduado extends Aluno implements Avaliacao {

    public AlunoGraduado(String nome, int matricula, double nota) {
        super(nome, matricula, nota);
    }

    @Override 
    public double calcularMedia() {
        return getNota() * 1.0;
    }
}
