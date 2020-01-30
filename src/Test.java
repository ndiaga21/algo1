import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList list_A_trie = new ArrayList<>();
        list_A_trie.addAll(Arrays.asList(1,3,5,4,2,8,9,0,7,6));
        System.out.println(list_A_trie);
       Tri_Rapide.tri_rapide(list_A_trie,0,list_A_trie.size()-1);
       // Tri_Rapide.partitionner(list_A_trie,0,list_A_trie.size()-1);
        System.out.println(list_A_trie);
    }
}
