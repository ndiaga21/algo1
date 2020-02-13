import java.util.ArrayList;
import java.util.List;

public class Generation {
    public static List<Integer> genereList(int borne1, int borne2) {
        ArrayList<Integer> list_Genere = new ArrayList<>();
        if (borne2 < borne1) {
            int tmp = borne1;
                borne1 = borne2;
                borne2 = tmp;
        }
        for (int i =borne1; i <borne2 ; i++) {
            list_Genere.add(borne1 + (int)(Math.random() * ((borne2 - borne1) + 1)));

        }

        return list_Genere;
    }

}
