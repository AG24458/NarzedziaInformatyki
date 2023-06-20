import java.sql.SQLOutput;
import java.util.Collections;
import java.util.LinkedList;

public class Alindeklist {
    public static void main(String[] args) {
        System.out.println("------------------ Linked List -----------------------");
        LinkedList<String> list = new LinkedList<>();
        list.add("Gliwice");
        list.add("Katowice");
        list.add("Lublin");
        list.add("Gdańsk");

        System.out.println(list);
        display(list);
        Collections.sort(list);
        System.out.println("-----------------Sort ASC---------------------------");
        display(list);
        System.out.println("----------------Sort Desk-------------------------");
        display(list);
        System.out.println(list.get(2));
    }

    public static void display(LinkedList<String> miasta){
        for (String e:miasta){
            System.out.println(e);
        }
    }
}
