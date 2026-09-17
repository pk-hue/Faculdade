public class AlunoPosGraduado extends Aluno implements Avaliacao {
    public AlunoPosGraduado(String nome, int matricula, double nota) {
        super(nome, matricula, nota);
    }

    @Override 
    public double calcularMedia() {
        return getNota() * 1.2;
    }
}
