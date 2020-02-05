 import java.util.ArrayList;

public class Tri_Tas {

    public static void tri_par_tas(ArrayList<Integer> list) {
        construire_Tas_Max(list);
        int taille = list.size() - 1;
        ArrayList<Integer> listUtil = new ArrayList<>(list);
        while (taille >= 0) {
            permute(listUtil, listUtil.get(taille), listUtil.get(0));
            list.set(taille, listUtil.get(taille));
            listUtil.remove(taille);
            taille = taille - 1;
            entasser_Max(listUtil, 0);
        }
    }

    public static void construire_Tas_Max(ArrayList<Integer> list) {
        int moitie = (list.size() - 1) / 2;
        for (int i = moitie; i >= 0; i--) {
            entasser_Max(list, i);
        }
    }

    public static void entasser_Max(ArrayList<Integer> list, int i) {
        int max = i;
        int gauche = gauche(i);
        int droite = droite(i);
        if (gauche < list.size() && list.get(gauche) > list.get(i)) {
            max = gauche;
        }
        if (droite < list.size() && list.get(droite) > list.get(max)) {
            max = droite;
        }

        if (max != i) {
            permute(list, list.get(max), list.get(i));
            entasser_Max(list, max);

        }
    }

    private static void permute(ArrayList<Integer> t, int val1, int val2) {
        int tmp = val1;
        t.set(t.indexOf(val1), val2);
        t.set(t.indexOf(val2), tmp);
    }

    private static int droite(int i) {
        return 2 * i + 2;
    }

    private static int gauche(int i) {
        return 2 * i + 1;
    }

}
