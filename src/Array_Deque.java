import java.util.ArrayDeque;

public class Array_Deque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> name=new ArrayDeque<>();
        name.offer(4);
        name.offer(1);
        name.offer(8);
        name.offer(3);
        System.out.println(name);
        System.out.println(name.peek());
        name.push(1);
        System.out.println(name);
        name.pop();
        System.out.println(name);
        name.addFirst(20);
        System.out.println(name);
        name.addLast(20);
        System.out.println(name);
        System.out.println(name.size());

    }
}
