import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        // уловные конструкции Switch_Case
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println();
    //
    switch (num){
        case 1:
            System.out.println("number is 1");
            break;
        case 2:
            System.out.println("number is 2");
            break;
        case 16:
            System.out.println("number is 16");
            break;
        default:
            System.out.println("default");
        }
    }
}

