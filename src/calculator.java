import java.util.Scanner;
public class calculator {
// калькулятор
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // блок ввода переменных
        System.out.println("Введите первую переменную");
        int number1 = scanner.nextInt();
        System.out.println("Введите вторую переменную");
        int number2 = scanner.nextInt();
        System.out.println("Выберите действие");
        String char1 = scanner.next();
        // логические выражения
        /*
        логическое выражение с применением сравнения equals
        equals применяется для срвнения строк, когда нужно сравнить String
        (login.equals(Пользователь1)) в резульатате чего в случае когда выражение true
        после выполнения услвоия выполнится блок логической оперции
         */
            if(char1 .equals("+")){
                System.out.println(number1+number2);
            }else if (char1 .equals("-")) {
                System.out.println(number1-number2);
            }else if (char1 .equals("*")) {
                System.out.println(number1*number2);
            }else if (char1 .equals("/")) {
                System.out.println(number1/number2);
            }else{
                System.out.println("Ошибка! Попробуйте еще раз.");
        }
    }
}

