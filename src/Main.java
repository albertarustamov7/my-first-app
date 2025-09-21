import java.util.Scanner;
public class Main {
    static String greet(String nameUser){
        return "Привет" + nameUser + '!';
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nameUserHello = input.nextLine();
        System.out.println(greet(nameUserHello));
        String nameUserHello1 = input.nextLine();
        System.out.println(greet(nameUserHello1));

    }
}