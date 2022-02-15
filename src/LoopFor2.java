public class LoopFor2 {

    public static void main(String[] args) {
        System.out.println("Числа кратные четырем в диапазоне от 100 до 1:");

        for (int i = 100; i >= 1; i--) {
            if (checkMultiplicity4(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkMultiplicity4 (int a) {
        return (a % 4 == 0);
    }

}
