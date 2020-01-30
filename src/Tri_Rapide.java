import java.util.ArrayList;

public class Tri_Rapide {

    public static void tri_rapide(ArrayList<Integer> list, int premier, int dernier) {

        if (premier < dernier) {
           // int pivot = choix_pivot(list, premier, dernier);
            int pivot = partitionner(list, premier,dernier);
            tri_rapide(list, premier, pivot-1);
            tri_rapide(list,pivot+1,dernier);

        }
        //System.out.println(m);
    }

    public static int partitionner(ArrayList<Integer> list, int premier, int dernier) {
         // echanger(list.get(pivot),list.get(dernier));
        int pivot = list.get(dernier);
        int j = premier;
        for (int i = premier; i < dernier; i++) {
            if (list.get(i) <= pivot) {
                j=j+1;
                echanger(list,list.get(i), list.get(j));

            }
        }

        echanger(list,list.get(dernier),list.get(j));
        System.out.println(j);
        return j;
    }

    private static void echanger(ArrayList<Integer> t,int val1, int val2) {
        int tmp = t.get(val1);
        t.set(val1,t.get(val2));
        t.set(val2, tmp);

    }

    private static int choix_pivot(ArrayList<Integer> list, int premier, int dernier) {
         int pivot = (int) (Math.random()*(dernier-premier));
        return list.get(pivot);
    }
}

