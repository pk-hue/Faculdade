package br.edu.operacoes;

public class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException() {
        super("Divisão por zero não permitida!");
    }
}
