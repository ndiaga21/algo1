import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list_A_trie = new ArrayList<>();
        list_A_trie.addAll(Generation.genereList(0,10000));
        long debut_tri_Bulle = System.currentTimeMillis();
         Tri_Bulle.tri_bulle(list_A_trie);
         long fin_tri_bulle= System.currentTimeMillis() - debut_tri_Bulle;
         System.out.println("temps d'execution tri bulle "+fin_tri_bulle);


         list_A_trie.clear();
         list_A_trie.addAll(Generation.genereList(0,10000));
         long debut_tri_fusion = System.currentTimeMillis();
         Tri_Fusion.triFusion(list_A_trie,0,list_A_trie.size()-1);
         long fin_tri_fusion=System.currentTimeMillis() - debut_tri_fusion;
         System.out.println("temps d'execution tri fusion "+fin_tri_fusion);


        list_A_trie.clear();
        list_A_trie.addAll(Generation.genereList(0,10000));
        long debut_tri_rapide = System.currentTimeMillis();
        Tri_Rapide.tri_rapide(list_A_trie,0,list_A_trie.size()-1);
        long  fin_tri_rapide = System.currentTimeMillis()-debut_tri_rapide;
        System.out.println("temps d'execution tri rapide "+fin_tri_rapide);

        list_A_trie.clear();
        list_A_trie.addAll(Generation.genereList(0,10000));
        long debut_tri_tas = System.currentTimeMillis();
        Tri_Tas.tri_par_tas(list_A_trie);
        long fin_tri_tas = System.currentTimeMillis() - debut_tri_tas;
        System.out.println("temps d'execution tri tas "+fin_tri_tas);

        list_A_trie.clear();
        list_A_trie.addAll(Generation.genereList(0,10000));
        long debut_tri_base = System.currentTimeMillis();
        Tri_Tas.tri_par_tas(list_A_trie);
        long fin_tri_base = System.currentTimeMillis() - debut_tri_base;
        System.out.println("temps d'execution tri base "+fin_tri_base);
    }
}
