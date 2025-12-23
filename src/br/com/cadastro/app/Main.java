package br.com.cadastro.app;

import br.com.cadastro.model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa(
                "João Victor",
                20,
                "508.559.498-30",
                1.80);

        joao.setIdade(30);

        System.out.println("Nome: " + joao.getNome());
        System.out.println("Idade: " + joao.getIdade());
        System.out.println("Maior de idade? " + joao.isMaiorDeIdade());
    }
}
