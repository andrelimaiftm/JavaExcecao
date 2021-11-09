public class App {
    public static void main(String[] args) {
        

        int[] vetor = {1,2,3,4,5};
        //int[] vetor = null;
        for (int i = 0; i <= vetor.length; i++) {
            try {
                System.out.println(vetor[i]);
            } 
            catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println(e1.getMessage());
            
            
        }
        System.out.println(vetor[0]);

    }
}
