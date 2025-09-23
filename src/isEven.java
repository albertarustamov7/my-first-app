import java.util.Scanner;
public class isEven {
static void isEven(int num){
    //  в методе проверяем что число четное или не четное
    if (num%2==0) System.out.println("Четное число");
    if (num%2!=0) System.out.println("Не четное число");
}
    //  главный метод на ввод
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        // ввод целый чисел на вывод
        int num1  = scanner.nextInt();
        int num2 = scanner.nextInt();
    isEven(num1);
    isEven(num2);
    }
}
