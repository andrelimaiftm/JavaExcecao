package br.edu.iftm.excecao.testes;

import br.edu.iftm.excecao.erro.Matematica;

public class MatematicaErroTeste {
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        try {
            matematica.divisao(5, 0);
        } catch (Exception e) {
            System.out.println("Houve um erro: ");
            e.printStackTrace();
        }
        System.out.println("Mensagem após o erro.");
    }
}
