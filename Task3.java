import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("В калькуляторе для выполнения доступны следующие действия: \n" +
        "1. Сложение (+) \n" +
        "2. Вычитание (-) \n" +
        "3. Умножение (*) \n" +
        "4. Деление (/) \n");

        System.out.print("Выберите необходимое действие: ");
        char operation = scanner.next().charAt(0);

        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')){
            System.out.println("Ошибка: Введён недопустимый оператор");
        }

        if (operation == '+'){
            double result = num1 + num2;
            System.out.println(result);
        }

        else if (operation == '-'){
            double result = num1 - num2;
            System.out.println(result);
        }

        else if (operation == '*'){
            double result = num1 * num2;
            System.out.println(result);
        }

        else if (operation == '/'){
            double result = num1 / num2;
            System.out.println(result);
        }

        scanner.close();
    }
}
