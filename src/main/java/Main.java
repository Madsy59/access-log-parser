import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();
        int sum = firstNumber + secondNumber;
        int raznost = firstNumber - secondNumber;
        int proizv = firstNumber * secondNumber;
        double chastnoe = (double) firstNumber / secondNumber;
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + raznost);
        System.out.println("Произведение чисел: " + proizv);
        System.out.println("Частное чисел: " + chastnoe);
    }
}
