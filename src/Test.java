import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Tri_Bulle tri_bulle = new Tri_Bulle();
        ArrayList listTrie = new ArrayList<>();
        listTrie.addAll(Arrays.asList());
        System.out.println(listTrie);
        tri_bulle.tri_bulle(listTrie);
        System.out.println(listTrie);
    }
}
