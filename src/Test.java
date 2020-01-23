import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,4,2,8,9,0,7,6);
        System.out.println(list);
        Tri_Bulle tri_bulle = new Tri_Bulle();
        ArrayList listTrie = new ArrayList<>();
        listTrie.addAll(list);
        tri_bulle.compare(listTrie);
        System.out.println(listTrie);
    }
}
