import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class tree_set
{
    public static void main(String[] args)
    {
        TreeSet<Integer> names = new TreeSet<>();
        names.add(14);
        names.add(30);
        names.add(2);
        names.add(8);
        System.out.println(names);
        System.out.println(names.first());
        System.out.println(names);
        System.out.println(names.last());
        System.out.println(names);
        System.out.println(names.ceiling(25));
        System.out.println(names);
        System.out.println(names.floor(20));
        System.out.println(names);
        System.out.println(names.higher(10));
        System.out.println(names);
        System.out.println(names.lower(4));
        System.out.println(names);
    }
}
