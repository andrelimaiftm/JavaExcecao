package br.edu.iftm.excecao.testes;

import br.edu.iftm.excecao.erro.ControleRemoto;
import br.edu.iftm.excecao.erro.ControleRemotoException;
import br.edu.iftm.excecao.erro.TvDesligadaException;
import br.edu.iftm.excecao.erro.TvLigadaException;

public class ControleRemotoErroTeste {
    public static void main(String[] args) {

        ControleRemoto ControleRemoto =  new ControleRemoto();
        
        try {
            ControleRemoto.ligar();
            //ControleRemoto.ligar();
            //ControleRemoto.aumentarVolume();
            //ControleRemoto.aumentarVolume();
            //ControleRemoto.aumentarVolume();
            //ControleRemoto.aumentarVolume();
            //ControleRemoto.diminuirVolume();
            ControleRemoto.desligar();
            ControleRemoto.desligar();
        }catch(TvDesligadaException e){
            System.out.println("Erro 1");
            System.out.println(e.getMessage());
        }catch(TvLigadaException e){
            System.out.println("Erro 2");
            System.out.println(e.getMessage());
        }catch(ControleRemotoException e){ 
            System.out.println("Erro 3");
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Erro 4");
            System.out.println(e.getMessage());
        }
    }
    
}
