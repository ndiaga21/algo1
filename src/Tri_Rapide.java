import java.util.ArrayList;

public class Tri_Rapide {

    public static void tri_rapide(ArrayList<Integer> list, int premier, int dernier) {

        if (premier < dernier) {
            int pivot = partitionner(list, premier, dernier);
            tri_rapide(list, premier, pivot - 1);
            tri_rapide(list, pivot + 1, dernier);

        }

    }

    private static int partitionner(ArrayList<Integer> list, int premier, int dernier) {
        int pivot = list.get(dernier);
        int j = premier-1;
        for (int i = premier; i < dernier; i++) {
            if (list.get(i) <= pivot) {
                j = j + 1;
                permute(list, list.get(i), list.get(j));
            }
         }
        permute(list, list.get(dernier), list.get(j+1));
        return j+1;
    }

    private static void permute(ArrayList<Integer> t, int val1, int val2) {
        int tmp = val1;
        t.set(t.indexOf(val1), val2);
        t.set(t.indexOf(val2), tmp);

    }

    private static int choix_pivot(ArrayList<Integer> list, int premier, int dernier) {
        int pivot = (int) (Math.random() * (dernier - premier));
        return list.get(pivot);
    }
}

