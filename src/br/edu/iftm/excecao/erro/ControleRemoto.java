package br.edu.iftm.excecao.erro;

public class ControleRemoto {
    
    private boolean estaLigado;
    private int volumeAtual;
    private boolean estaMudo;

    public ControleRemoto(){
        this.estaLigado = false;
        this.volumeAtual = 0;
        this.estaMudo = false;
    }

    public void ligar() throws Exception{
        if(this.estaLigado){
            //System.out.println("TV já está ligada!");
            //Exception excecao = new Exception("TV já está ligada!");
            //throw excecao;
            TvLigadaException excecao = new TvLigadaException();
            throw excecao;
        }else{
            this.estaLigado = true;
            System.out.println("A TV ligou");
        }
    }

    public void desligar() throws Exception{
        if(this.estaLigado == false){
            //System.out.println("A TV já está desligada!");
            //Exception excecao = new Exception("A TV já está desligada!");
            //throw excecao;
            throw new TvDesligadaException();
        }else{
            this.estaLigado = false;
            System.out.println("A TV desligou.");
        }
    }

    public void aumentarVolume() throws ControleRemotoException{
        if(this.volumeAtual > 60){
            //System.out.println("O volume está no máximo");
            throw new ControleRemotoException("O volume está no máximo");
        }
        this.volumeAtual += 40;
        System.out.println("O volume é: " +this.volumeAtual);
    }

    public void diminuirVolume() throws ControleRemotoException{
        if(this.volumeAtual < 40){
            //System.out.println("O volume está no minimo");
            throw new ControleRemotoException("O volume está no minimo");
        }
        this.volumeAtual -= 40;
        System.out.println("O volume é: " +this.volumeAtual);
    }

    public void ativarMudo(){
        this.estaMudo = true;
        System.out.println("A TV está muda");
    }

    public void desligarMudo(){
        this.estaMudo = false;
        System.out.println("A TV não está muda");
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public boolean isEstaMudo() {
        return estaMudo;
    }

    public void setEstaMudo(boolean estaMudo) {
        this.estaMudo = estaMudo;
    }

    
}
