public class LoopFor {

    public static void main(String[] args) {
        System.out.println("Числа кратные четырем в диапазоне от 1 до 100:");

        for (int i = 100; i >= 1; i--) {
            multipleS4(i);
        }
    }

    public static void multipleS4(int a) {
        if (a % 4 == 0) {
            System.out.print(a + " ");
        }
    }

}
