public class Produto {

    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 10.0;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Produto A", 20.0);
        Produto p2 = new Produto("Produto B");
        
        p1.exibirInformacoes();
        p2.exibirInformacoes();
    }
}
