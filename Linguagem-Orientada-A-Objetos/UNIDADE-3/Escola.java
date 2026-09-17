public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", 12345, 9.0);

        aluno1.setNota(10);
        aluno1.exibirInformacoes();

        System.out.println("-------------------");

        Avaliacao alunoGraduado = new AlunoGraduado("Maria", 54321, 8.5);
        Avaliacao alunoPosGraduado = new AlunoPosGraduado("João", 67890, 7.5);

        System.out.println("Média do aluno graduado: " + alunoGraduado.calcularMedia());
        System.out.println("Média do aluno pós-graduado: " + alunoPosGraduado.calcularMedia());
    }
}
