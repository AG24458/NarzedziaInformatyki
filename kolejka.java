import java.util.ArrayDeque;
import java.util.Queue;

public class kolejka {

    public static void main(String[] args){
        System.out.println("--------------- Druk ------------------");

        Queue<String> queue = new ArrayDeque<>();
        queue.add("Jeden");
        queue.add("Dwa");
        queue.add("Trzy");
        queue.add("Cztery");
        queue.add("Pięć");

        System.out.println("Ilosc elementow " + queue.size());
        render(queue);
        queue.poll();
        queue.poll();
        System.out.println("Bla Bla Bla Bla " + queue.size());
        render(queue);
        System.out.println(queue);

        queue.remove();
        System.out.println("Ilosc elementow po usunieciu " + queue.size());
        render(queue);

        queue.poll();
        queue.poll();
        System.out.println(queue);
        try {
            queue.remove();
            }catch (Exception e) {
            System.out.println("Bład"+e);
        }

    }

    static void  render(Queue<String>queue){
        for (String q: queue)
            System.out.println(q);
    }
}
