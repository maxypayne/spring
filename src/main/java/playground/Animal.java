package playground;

import java.util.ArrayList;
import java.util.List;

public class Animal<T, K> {
    public static void main(String[] args) {
    }
    public void setData(T name, K cousins) {
    }
    public <T extends Comparable<T>> T max(T x, T y) {
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        return max;
    }
    public <T extends Journalisable & Calculable> void traiter(T traitement) {
        String valeur = traitement.calculer();
        traitement.journaliser(valeur);
        int[] l = {1, 2, 4, 5, 6};
    }
}


class Arbre {
    static void alpha() {}
    void beta(){
        alpha();
    }
}