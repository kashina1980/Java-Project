import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Вычисление среднего арифметического диапазона чисел");
        System.out.println("Введите начальное значение диапазона: ");
        a = scanner.nextInt();
        int a1 = a; // сохранение начального значения
        System.out.println("Введите конечное значение диапазона: ");
        b = scanner.nextInt();

        int k = 0; // количество всех чисел диапазона
        int sum = 0; // сумма всех чисел диапазона//
        int k2 = 0; // количество всех чисел диапазона
        int sum2 = 0; // сумма всех чисел диапазона

        do {
            sum += a;
            if (a % 2 == 0) {
                sum2 += a;
                ++k2;
            }
            ++a;
            ++k;
        } while (a <= b);

        double average = (double) sum / k;
        double average2 = (double) sum2 / k2;

        System.out.println("Среднее арифметическое чисел от " + a1 + " до " + b + " равно " + average);
        System.out.println("Среднее арифметическое четных чисел от " + a1 + " до " + b + " равно " + average2);
    }
}
