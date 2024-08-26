import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {

        Set<Integer> S1 = new HashSet<Integer>();
        S1.add(23);
        S1.add(12);
        S1.add(23);
        S1.add(12);
        System.out.println(S1);
        S1.add(23);
        S1.add(12);
        System.out.println(S1);

    }
}
