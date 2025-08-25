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
/*
как работает switch.
switch  работает как конкретное заданное условие. Нельзя   сравнивать разные типы данных.
switch работает по принципу: если условие 1 , то выводим  2
если условие 3 то выводим 8
Например:
double result =0;  переменная вводится для приведения к  сумме ранее введеных переменных
        switch (char1){ переменая в switch  нужна для того чтобы выполнить условие для расчета
            case"+": result= number1+number2; Если пользователь в char1 записывает "+" то будет выражение case"+"
                break; Блок кода на этом после расчета останавливается
            case"-": result= number1-number2; Если пользователь в char1 записывает "-" то будет выражение case"-"
                break;
 */
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
