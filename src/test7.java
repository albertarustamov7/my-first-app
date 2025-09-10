import java.util.Scanner;
class test6 {
    // метод на вывод сообщения
    public static String greet(String input){
        return(input);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result =greet(input);
        //Программа на вывод сообщения
        System.out.println("Добрый день "+result);
    }
}