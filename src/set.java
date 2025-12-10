import java.util.HashSet;
import java.util.Set;

public class set
{
    public static void main(String[] args)
    {
        HashSet<Integer> names = new HashSet<Integer>();
        names.add(14);
        names.add(30);
        names.add(1);
        names.add(8);
        System.out.println(names);
        names.remove(30);
        System.out.println(names);
        System.out.println(names.contains(14));
        names.iterator();
        System.out.println(names);
        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());
    }
}
