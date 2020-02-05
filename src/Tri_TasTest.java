import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Tri_TasTest {
    ArrayList<Integer> listTrie = new ArrayList<>();
    ArrayList<Integer> list_A_trie = new ArrayList<>();
    @Test
    void tri_par_tas() {
        listTrie.addAll(Arrays.asList(1,2,3,4,7,8,9,10,14,16));
        list_A_trie.addAll(Arrays.asList(4,1,3,2,16,9,10,14,8,7));
        Tri_Tas.tri_par_tas(list_A_trie);
        assertArrayEquals(listTrie.toArray(),list_A_trie.toArray());
    }

    @Test
    void construire_Tas_Max() {
        ArrayList<Integer> listConstruireTasMax = new ArrayList<>();
        ArrayList<Integer> list_A_construieeTasMax = new ArrayList<>();
        list_A_construieeTasMax.addAll(Arrays.asList(4,1,3,2,16,9,10,14,8,7));
        listConstruireTasMax.addAll(Arrays.asList(16,14,10,8,7,9,3,2,4,1));
        Tri_Tas.construire_Tas_Max(list_A_construieeTasMax);
        assertArrayEquals(listConstruireTasMax.toArray(),list_A_construieeTasMax.toArray());
    }

    @Test
    void entasser_Max() {
        ArrayList<Integer> listEntasserMax = new ArrayList<>();
        ArrayList<Integer> list_A_EntasserMax = new ArrayList<>();
        list_A_EntasserMax.addAll(Arrays.asList(16,4,10,14,7,9,3,2,8,1));
        listEntasserMax.addAll(Arrays.asList(16,14,10,8,7,9,3,2,4,1));
        Tri_Tas.entasser_Max(list_A_EntasserMax,1);
        assertArrayEquals(listEntasserMax.toArray(),list_A_EntasserMax.toArray());
    }
}