package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        Mensagem.obtermensagem(9);
        Mensagem.obtermensagem(14);
        Mensagem.obtermensagem(1);

        // Empréstimo
        System.out.println("Excecício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
