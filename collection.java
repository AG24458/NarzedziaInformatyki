import java.util.ArrayList;
import java.util.Collections;

public class collection {
    static void render (ArrayList<String> wykaz){
        for (String e: wykaz){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("-------------- Array List --------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("Anna");
        list.add("Łucja");
        list.add("Marta");
        list.add("Kasia");
        list.add("Ola");

        System.out.println(list);
        render(list);
        Collections.sort(list);
        System.out.println("----------------- Lista sort ASC -----------------");
        render(list);
        Collections.reverse(list);
        System.out.println("----------------- Lista sort DESC -----------------");
        render(list);
        Collections.shuffle(list);
        System.out.println("----------------- Shuffle -----------------");
        render(list);
        System.out.println("----------------- MIN ----------------- \n" +  Collections.min(list));
        System.out.println("----------------- MAX ----------------- \n" + Collections.max(list));
       

    }


}