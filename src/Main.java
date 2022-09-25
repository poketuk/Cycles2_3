public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int currentYear = 2022;
        int startPeriod = currentYear - 200;
        int endPeriod = currentYear + 100;
        for (int i = startPeriod; i <= endPeriod; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}