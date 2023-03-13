public class Task2 {
    
    public static void main(String[] args) {

        for (int i = 2; i <= 1000; i++) {
            boolean primeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    primeNumber = false;
                    break;
                }
                
            }
            if (primeNumber){
                System.out.print(i + " ");
            }
        }
    }
}
