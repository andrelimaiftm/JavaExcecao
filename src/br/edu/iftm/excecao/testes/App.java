package br.edu.iftm.excecao.testes;
public class App {
    public static void main(String[] args) {
        
        int[] vetor = null;
        int[] numeros = new int[]{1,2,3,4};
        int[] pesos = new int[]{5,0,4};
        for (int i = 0; i < numeros.length; i++) {
            try{
                vetor[0] = 1;
                //int resultado = numeros[i]/pesos[i];
                //System.out.printf("%d / %d = %d \n",numeros[i], pesos[i], resultado);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Houve um problema ao acessar o indice do array");
                //System.out.println(e.getMessage());
            }  catch(ArithmeticException e){
                System.out.println("Houve um erro no calculo.");
                System.out.println(e.getMessage());
            } catch(NullPointerException e){
                System.out.println("Houve um erro: valor nulo foi encontrado");
                System.out.println(e.getMessage());
            } catch(Exception e){
                System.out.println(e.getMessage());            
            }                   
        }
        System.out.println("Mesagem executada após o erro");
    }
}
