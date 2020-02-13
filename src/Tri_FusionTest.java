import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Tri_FusionTest {

    @Test
    void triFusion() {
        ArrayList<Integer> listTrie = new ArrayList<>();
        ArrayList<Integer> list_A_trie = new ArrayList<>();
        listTrie.addAll(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        list_A_trie.addAll(Arrays.asList(1,3,5,4,2,8,9,0,7,6));
        Tri_Fusion.triFusion(list_A_trie,0,list_A_trie.size()-1);
        assertArrayEquals(listTrie.toArray(),list_A_trie.toArray());
    }
}