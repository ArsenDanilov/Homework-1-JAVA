import java.util.Scanner;
public class Task1 {

    public class Hometask1 {
    
        public static void main(String[] args) {
            System.out.print("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            scanner.close();
            int triangle_value = 0;
            for (int i = 0; i <= value; i++) {
                triangle_value = triangle_value + i;
            }
            System.out.println("Треугольное число значения " + value + " равняется: " + triangle_value);
    
            
        }
    }
}
