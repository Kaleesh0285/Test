public class ReverseString {

    public static void main(String[] args) {

        String a = "Seleniumjava";

        char[] c = a.toCharArray();

        String k = "";

        for (int i = c.length-1; i >= 0; i--) {
            System.out.println(c[i]);

            k += c[i];
        }
    }
}
