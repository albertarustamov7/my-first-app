public class USLOVNYI_CONSTRUKCEI {
    public static void main(String[] args) {
        int a = 1, b = 2;
        double number1 = 2.2, number2 = 5.6;
        boolean isHascar = true;
/* оператор if Перввым выполняется  if  если услвие что в скоках не выболяется
то переходит к сследующему участку
        */
        if (isHascar == false) {
            System.out.println("Выводит");
            /* оператор else if. блок  идет после if , если if  не выполняется в блоке
            if, то дейсвие переходит  к блоку else if */
        } else if (a>b){
            System.out.println("другое выражение");
 /* Блок esle.  после исполнения блока когда else if если условие ложное то
 действие переходит к блоку else
 */
        }else{
            System.out.println("не выводит");
        }
    }
}

