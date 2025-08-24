import java.util.Scanner;
public class testNew {
    public static void main(String[] args) {
        // Ввод на консоль для вывода
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double number1 = scanner.nextDouble();
        System.out.println("Введите дейсвие");
        String char1 = scanner.next();
        System.out.println("Введите число");
        double number2 = scanner.nextDouble();
        double result =0;
        switch (char1){
            case"+": result= number1+number2;
                break;
            case"-": result= number1-number2;
                break;
            case"*": result= number1*number2;
                break;
            case"/": result= number1/number2;
                break;
            default:
                System.out.println("Ошибка попробуйте позже");

        }
        System.out.println(result);
    }
}
