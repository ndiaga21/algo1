import java.util.ArrayList;

public class Tri_Base {

    public static void tri_par_base(ArrayList<Integer> list, int base) {
        int m = max(list);
        int p = 1;

        while ((m / p) > 0) {
            denombrement(list, base, p);
            p=p*base;

        }
        System.out.println(list);
    }

    public static void denombrement(ArrayList<Integer> list, int base, int p) {
        ArrayList<Integer> sortie = new ArrayList<>();
        ArrayList<Integer> compteur = new ArrayList<>();
        initialiser_A_Zero(compteur, base);
        initialiser_A_Zero(sortie, list.size());
        for (int i = 0; i < list.size(); i++) {
            compteur.set((list.get(i) / p) % base, compteur.get((list.get(i) / p) % base) + 1);
        }

        for (int i = 1; i < base; i++) {
            compteur.set(i, compteur.get(i) + compteur.get(i - 1));
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            sortie.set(compteur.get((list.get(i) / p) % base) - 1, list.get(i));
            compteur.set((list.get(i) / p) % base, compteur.get((list.get(i) / p) % base) - 1);
        }

        list.clear();
        list.addAll(sortie);
        sortie.clear();
        compteur.clear();

    }

    private static void initialiser_A_Zero(ArrayList<Integer> compteur, int base) {
        for (int i = 0; i < base; i++) {
            compteur.add(0);
        }
    }

    private static int max(ArrayList<Integer> list) {
        int maxValeur = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (maxValeur < list.get(i)) {
                maxValeur = list.get(i);
            }
        }
        return maxValeur;
    }
}
