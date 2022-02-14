import java.util.Scanner;

public class Digital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача про цифры числа");
        System.out.println("Введите целое положительное число: ");
        int n = scanner.nextInt();
        int digital;

        int sum = 0; // сумма всех цифр числа//
        int max = 0; // максимальная цифра
        int sum1 = 0; // сумма нечетных цифр числа

        do {
            digital = n % 10;
            sum += digital;
            if (digital % 2 == 1) {
                sum1 += digital;
            }
            if (max < digital) {
                max = digital;
            }
            n = n / 10;
        } while (n > 0);

        System.out.println("Сумма цифр числа: " + sum);
        System.out.println("Сумма нечетных цифр числа: " + sum1);
        System.out.println("Максимальная цифра числа: " + max);

    }
}
