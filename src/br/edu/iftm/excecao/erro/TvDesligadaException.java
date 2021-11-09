package br.edu.iftm.excecao.erro;

public class TvDesligadaException extends ControleRemotoException{

    public TvDesligadaException() {
        super("A TV já está desligada!");        
    }
    
}
