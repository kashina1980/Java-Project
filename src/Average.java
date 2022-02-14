import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Введите начальное значение диапазона: ");
        a = scanner.nextInt();
        int startValue = a; // сохранение начального значения
        System.out.println("Введите конечное значение диапазона: ");
        b = scanner.nextInt();

        int count = 0; // количество всех чисел диапазона
        int sum = 0; // сумма всех чисел диапазона
        int count2 = 0; // количество всех чисел диапазона
        int sum2 = 0; // сумма всех чисел диапазона

        while (a <= b) {
            sum += a;
            if (a % 2 == 0) {
                sum2 += a;
                ++count2;
            }
            ++a;
            ++count;
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое чисел от " + startValue + " до " + b + " равно " + average);

        if (count2 == 0) {
            System.out.println("Среднее арифметическое четных чисел вычислить не возможно, так как в диапазоне нет четных чисел");
        } else {
            double average2 = (double) sum2 / count2;
            System.out.println("Среднее арифметическое четных чисел от " + startValue + " до " + b + " равно " + average2);
        }
    }
}
