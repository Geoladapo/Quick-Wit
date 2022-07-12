import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Abiodun");
        list.add("Chuks");
        list.add("Bola");
        list.add("Joseph");
        list.add("Daniel");
        list.add("Hannah");
        list.add("Deborah");
        list.add("Mathew");
        list.add("Gift");
        list.add("samuel");
        list.add("Bill");
        list.add("Precious");
        list.add("Solomon");
        list.add("Hillary");
        list.add("Williams");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
