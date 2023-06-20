import java.util.Stack;

public class Stos {
    public static void main(String[] args) {
        System.out.println("------------------ Stos ---------------------");
        Stack<String> stack = new Stack<>();
        stack.add("Jeden");
        stack.add("Dwa");
        stack.add("Trzy");
        stack.add("Cztery");

        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.push("Siedem");
        System.out.println(stack);
    }
}