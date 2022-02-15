import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = scanner.nextInt();
        n = Math.abs(n);
        int digit;

        int sum = 0;
        int max = 0;
        int sum1 = 0;

        while (n > 0) {
            digit = n % 10;
            sum += digit;
            if (digit % 2 == 1) {
                sum1 += digit;
            }
            if (max < digit) {
                max = digit;
            }
            n = n / 10;
        }

        System.out.println("Сумма цифр числа: " + sum);
        System.out.println("Сумма нечетных цифр числа: " + sum1);
        System.out.println("Максимальная цифра числа: " + max);

    }
}
