import java.util.ArrayList;

public class Tri_Fusion {

    public static void triFusion(ArrayList<Integer> list,int deb,int fin)
    {
        if (deb!=fin)
        {
            int milieu=(fin+deb)/2;
            triFusion(list,deb,milieu);
            triFusion(list,milieu+1,fin);
            fusion(list,deb,milieu,fin);
        }
    }

    private static void fusion(ArrayList<Integer> list, int deb1, int fin1, int fin2)
    {
        int deb2=fin1+1;

        //on recopie les éléments du début du tableau
        ArrayList<Integer> list1=new ArrayList<>(fin1-deb1+1);
        for(int i=deb1;i<=fin1;i++)
        {
            list1.add(i-deb1,list.get(i));
        }

        int compt1=deb1;
        int compt2=deb2;

        for(int i=deb1;i<=fin2;i++)
        {
            if (compt1==deb2) //c'est que tous les éléments du premier tableau ont été utilisés
            {
                break; //tous les éléments ont donc été classés
            }
            else if (compt2==(fin2+1)) //c'est que tous les éléments du second tableau ont été utilisés
            {
                list.set(i,list1.get(compt1-deb1)); //on ajoute les éléments restants du premier tableau
                compt1++;
            }
            else if (list1.get(compt1-deb1)<list.get(compt2))
            {
                list.set(i,list1.get(compt1-deb1)); //on ajoute un élément du premier tableau
                compt1++;
            }
            else
            {
                list.set(i,list.get(compt2)); //on ajoute un élément du second tableau
                compt2++;
            }
        }
    }


}
