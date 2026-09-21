package br.edu.operacoes;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica divisao = new Divisao();

        System.out.println("--- Executando Soma ---");
        try{
            double resultadoSoma = soma.calcular(15.5, 5);
            System.out.println("Resultado da soma: " + resultadoSoma);
        } catch (Exception e) {
            System.out.println("Erro na soma: " + e.getMessage());
        }

        System.out.println("--- Executando Divisao ---");
        try {
            //teste com o resultado certo
            double resultadoDivisao = divisao.calcular(20, 4);
            System.out.println("Resultado da divisao: " + resultadoDivisao);

            //forçando o erro/exception
            double resultadoDivisao2 = divisao.calcular(10, 0);
            System.out.println("Resultado da divisao2: " + resultadoDivisao2);
        }catch (DivisaoPorZeroException e){
            System.out.println("Exceção capturada: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Erro na divisao: " + e.getMessage());
        }
    }
}
