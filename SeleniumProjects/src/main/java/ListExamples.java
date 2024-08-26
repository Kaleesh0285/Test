import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {

        List <Integer> l1 = new ArrayList<Integer>();
        l1.add(12);
        l1.add(11);
        System.out.println(l1);
        l1.add(10);
        l1.add(9);
        System.out.println(l1);
        l1.add(1);
        l1.add(12);
        System.out.println(l1);
    }
}
