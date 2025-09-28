import java.util.Scanner;

public class CountNumber {

    public static void welcome() {
        System.out.println("Здравствуйте!");
    }

    // Метод для подсчёта СУММЫ чётных чисел
    static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    // Метод для ввода массива с клавиатуры
    static int[] inputArray(Scanner scanner, int size) {
        int[] arr = new int[size];
        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Основной метод вывода
    static void outputResult(int[] numbers) {
        welcome();
        int sum = sumEvenNumbers(numbers);
        System.out.println("Сумма чётных чисел: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 20;

        // Вводим 20 целых чисел
        int[] massivNum = inputArray(scanner, SIZE);

        // Выводим результат
        outputResult(massivNum);

        scanner.close();
    }
}