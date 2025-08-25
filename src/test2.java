import java.util.Scanner;
public class test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите варинат 1");
    int result1 = scanner.nextInt();
        System.out.println("Введите варинат 2");
    int result2 = scanner.nextInt();
        System.out.println("Введите варинат 3");
    int result3 = scanner.nextInt();
// compaire what is bigger
    if ((result1>result2)&& (result1>result3)){
        System.out.println("наибольшее" +result1);
        }else if ((result2>result1)&& (result2>result3)) {
        System.out.println("наибольшее" +result2);
        }else if ((result3>result2)&& (result3>result1)) {
        System.out.println("наибольшее" +result3);
        }else
        System.out.println("Вы ввели не верное занчение");
        // compaire what is little
        int min =result1;
        if (result1<result2&&result1<result3){
            System.out.println("Наименьшее"+result1);
        } else if (result2<result1&&result2<result3) {
            System.out.println("Наименьшее"+result2);
        }else {
            System.out.println("Наименьшее"+result3);
        }
    }
}
