import java.util.LinkedHashSet;

public class linkedlist
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> names=new LinkedHashSet<>();
        names.add(14);
        names.add(30);
        names.add(2);
        names.add(8);
        System.out.println(names);
        System.out.println(names.add(2));
        System.out.println(names);


    }
}
