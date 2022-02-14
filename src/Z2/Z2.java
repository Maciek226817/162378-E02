import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Z2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        print(a);
        System.out.println("\n");
        LinkedList<String> b = new LinkedList<>();
        b.add("a");
        b.add("b");
        b.add("c");
        print(b);
        System.out.println("\n");

        TreeSet<String> c = new TreeSet<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        print(c);

    }
    public static <E> void print(Iterable<E> n){
//        n.forEach((i) ->{System.out.print(i+  ",");});
        StringBuffer b = new StringBuffer();
        b.append('[');
        n.forEach(i -> b.append(',').append(i.toString()));
        b.append(']');
        System.out.println(b.substring(0,b.length()).toString());
    }
}
