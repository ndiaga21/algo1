import java.util.ArrayList;

public class Tri_Bulle {

   // ArrayList<Integer> tab = new ArrayList<>();
   static boolean tri = false;
     static int  borne=0;

    public static void tri_bulle(ArrayList<Integer> tab1) {
        borne=tab1.size();
        tri=false;
        while (tri==false) {
            tri=true;
            for (int i = 0; i < borne-1; i++) {
                if (tab1.get(i) > tab1.get(i + 1)) {
                 permute(tab1, i, i+1);
                 tri=false;
                }

            }
            borne=borne-1;
        }
    }


    private static void permute(ArrayList<Integer> t, int index, int nextIndex) {
        int tmp = t.get(index);
        t.set(index,t.get(nextIndex));
        t.set(nextIndex, tmp);

    }
}
