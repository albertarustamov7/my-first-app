class test6 {
// работа с методами включает в себя главный метод
    // в который входя 3 отдельных метода
    static void maxi(){
        maximum();
        minimum();
        cila();
    }
    // каждый из приведеных методов выводит на консоль текст сообщение
    // метод не возвращает ничего
    static void maximum() {
        System.out.println("программа 1");
    }
    static void minimum(){
        System.out.println("программа 2");
    }
    static void cila(){
        System.out.println("программа 3");
    }
    public static void main(String[] args) {
        maxi();
    }
}