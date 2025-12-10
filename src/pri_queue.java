import java.util.PriorityQueue;

public class pri_queue
{
    public static void main(String[] args)
    {
      PriorityQueue<Integer> name=new PriorityQueue<>();
      name.offer(4);
      name.offer(1);
      name.offer(8);
      name.offer(3);
      System.out.println(name);
      System.out.println(name.poll()); //it will remove
        System.out.println(name);
        System.out.println(name.peek());//it will deleted based on the first element
    }
}
