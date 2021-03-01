import java.util.Stack;
public class Main {
    public static void main(String[] args){
        Stack<String> auto = new Stack<>();
        auto.push("Chevrolet");
        auto.push("Mercedes");
        auto.push("Mustang");
        auto.push("Porsche");
        auto.push("Ferrari");

        for(String s: auto) {
            System.out.println(s);
        }
       /* String a = auto.pop();
        System.out.println(a);*/
        System.out.println("----------------------------");

        System.out.println(auto.pop() + " ---удалить верхний элемент"); //удалить верхний элемент
        System.out.println(auto.peek() + " ---распечатать последний элемент после удаления"); //распечатать последний элемент после удаления

        System.out.println("----------------------------");

        for(String s: auto) {
            System.out.println(s);
        }

        System.out.println("----------------------------");

        int p = auto.search("Chevrolet"); //найти позицию первого добавленного элемента
        System.out.println(p + " ---найти позицию первого добавленного элемента");
    }
}
