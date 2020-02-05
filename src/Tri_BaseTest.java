import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Tri_BaseTest {

    @Test
    void tri_par_base() {
    }

    @Test
    void denombrement() {
        ArrayList<Integer> list_trie = new ArrayList<>();
       list_trie.addAll(Arrays.asList(100,90,92,13,54,87,77,28));
        ArrayList<Integer> list_a_trie_par_denombrement = new ArrayList<>();
        list_a_trie_par_denombrement.addAll(Arrays.asList(100,92,28,90,13,54,87,77));
        Tri_Base.denombrement(list_a_trie_par_denombrement,10,1);
        assertArrayEquals(list_a_trie_par_denombrement.toArray(),list_trie.toArray());
    }


}
