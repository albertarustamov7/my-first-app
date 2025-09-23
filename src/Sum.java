import java.util.Scanner;
public class Sum {
    // метод на вывод суммы чисел
    static double sumNumber ( int a,  int b ){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two  numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double result = sumNumber(num1,num2);
        System.out.println( "Сумма" + result);

        scanner.close();
    }
}
