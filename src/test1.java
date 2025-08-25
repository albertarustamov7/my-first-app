import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Блок на ввод числа
        System.out.println("Введите число");
        int number = scanner.nextInt();
        if (number%2==0){// блок на просмотр четное число или нет
            System.out.println("Четное");
        }else
            System.out.println("не четное");
    }

}
