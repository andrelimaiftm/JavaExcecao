package br.edu.iftm.excecao.erro;

public class TvLigadaException extends ControleRemotoException{

    public TvLigadaException() {
        super("A TV já está liga!");        
    }
    
}
