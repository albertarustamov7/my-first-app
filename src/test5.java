import java.util.List;

public class test5 {

    // 1. Примитив
    public static void printAge(int age) {
        System.out.println("Возраст: " + age);
    }

    // 2. Строка
    public static void sayHello(String name) {
        System.out.println("Привет, " + name);
    }

    // 3. Массив
    public static void printScores(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    // 4. Несколько параметров
    public static void introduce(String name, int age, boolean isActive) {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Активен: " + isActive);
    }

    // 5. Varargs
    public static void printTags(String... tags) {
        System.out.println("Теги: ");
        for (String tag : tags) {
            System.out.print(tag + " ");
        }
        System.out.println();
    }

    // 6. Список (из Collections)
    public static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println("Имя: " + name);
        }
    }

    public static void main(String[] args) {
        printAge(30);
        sayHello("Максим");
        printScores(new int[]{5, 4, 3, 5});
        introduce("Ольга", 28, true);
        printTags("Java", "Programming", "Beginner");
        printNames(List.of("Анна", "Иван", "Сергей"));
    }
}