import java.util.Stack;
public class Main {
    public static void main(String[] args){
        Stack<String> auto = new Stack<>();
        auto.push("Chevrolet");
        auto.push("Mercedes");
        auto.push("Mustang");
        auto.push("Porsche");
        auto.push("Ferrari");

       /* String a = auto.pop();
        System.out.println(a);*/
        System.out.println(auto.pop()); //удалить верхний элемент
        System.out.println(auto.peek()); //распечатать последний элемент после удаления

        for(String s: auto) {
            System.out.println(s);
        }
        int p = auto.search("Chevrolet"); //найти позицию первого добавленного элемента
        System.out.println(p);
    }
}
