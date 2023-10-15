package learn.collections;

public class EnumMap {
    public enum ETAT {
        NOUVEAU, EN_COURS, EN_PAUSE, INDETERMINE, TERMINE;
    }
    EnumMap<ETAT, String> enumMap = new EnumMap<>(ETAT.class);
}
