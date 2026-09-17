public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 11.99);
        Produto produto2 = new Produto("Produto B", 15.49);
        Produto produto3 = new Produto();

        produto1.exibirDados();
        produto2.exibirDados();
        produto3.exibirDados();

        Produto.exibirQuantidadeTotal();
    }
}
