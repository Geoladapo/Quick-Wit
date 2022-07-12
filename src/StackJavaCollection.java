import java.util.Iterator;
import java.util.Stack;

public class StackJavaCollection {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Pawpaw");
        stack.push("Mangoes");
        stack.push("Water Melon");
        stack.push("Apple");
        stack.push("Oranges");
        stack.push("cashew");
        stack.push("Grape");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("cucumber");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
