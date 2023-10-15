package playground;

//T : un type comme premier paramètre
//E : un élément notamment dans les types de l'API Collection
//N : un nombre
//S, U V : un type comme paramètre supplémentaire
//K : la clé d'une Map
//V : la valeur d'une map

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static playground.IdValue.*;
interface  Operationable {
    int  calculate ( int  x , int  y );
}
public class Main {
    public static void main(String[] args) {
//        Animal<String, String[]> animal = new Animal<>();
//        Animal<String, int[]> animal2 = new Animal<>();
//        String [] cousins = {"NANI", "PLIE", "TIUX"};
//        IdValue<Integer> idValue = new IdValue<>();
////        idValue.getValue();
////        ArrayList arrayList = new ArrayList();
////        List arrayList2 = new ArrayList();
////        arrayList.retainAll();
////        arrayList2.retainAll();
//        boolean sisEmpty = getData();
//        int[] cousins2 = {1,2,3};
//
//        animal.setData("Daisy", cousins);
////        animal2.traiter("fdfdfd");
//        animal.max(2, 2);
//        animal2.setData("Daisy", cousins2);
//
//        String[] tableau = { "A", "B", "C", "D" };
//        List<String> liste = new ArrayList<String>();
//
//        Collections.addAll(liste, tableau);
        Operationable operation = (x, y) -> x + y;
        System.out.println(operation.calculate(30, 90));
        String s = "dsad";
        System.out.println(s.length());

    }
}


//interface Entry<K, V> {
//    K getKey();
//    V getValue();
//    V setValue(V value);
//    boolean equals(Object o);
//    int hashCode();
//    public static <K extends Comparable<? super K>, V> Comparator<Map.Entry<K, V>> comparingByKey() {
//        return (Comparator<Map.Entry<K, V>> & Serializable)
//                (c1, c2) -> c1.getKey().compareTo(c2.getKey());
//    }
//    public static <K, V extends Comparable<? super V>> Comparator<Map.Entry<K, V>> comparingByValue() {
//        return (Comparator<Map.Entry<K, V>> & Serializable)
//                (c1, c2) -> c1.getValue().compareTo(c2.getValue());
//    }
//    public static <K, V> Comparator<Map.Entry<K, V>> comparingByKey(Comparator<? super K> cmp) {
//        Objects.requireNonNull(cmp);
//        return (Comparator<Map.Entry<K, V>> & Serializable)
//                (c1, c2) -> cmp.compare(c1.getKey(), c2.getKey());
//    }
//    public static <K, V> Comparator<Map.Entry<K, V>> comparingByValue(Comparator<? super V> cmp) {
//        Objects.requireNonNull(cmp);
//        return (Comparator<Map.Entry<K, V>> & Serializable)
//                (c1, c2) -> cmp.compare(c1.getValue(), c2.getValue());
//    }
//    @SuppressWarnings("unchecked")
//    public static <K, V> Map.Entry<K, V> copyOf(Map.Entry<? extends K, ? extends V> e) {
//        Objects.requireNonNull(e);
//        if (e instanceof KeyValueHolder) {
//            return (Map.Entry<K, V>) e;
//        } else {
//            return Map.entry(e.getKey(), e.getValue());
//        }
//    }
//}


