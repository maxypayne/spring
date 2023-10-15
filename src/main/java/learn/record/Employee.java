package learn.record;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record Employee<T>(String name, List<T> list) {
    public Employee() {
        this("Inconu", (List<T>) Arrays.asList("A", "B", "C"));
    }
//    public Employee {
//        if (name == null || name.trim().isEmpty()) {
//            throw new IllegalArgumentException("Le nom est obligatoire.");
//        }
//        if (name.length() > 20) {
//            name += " TOO BIG";
//        }
//    }
//    public String name() {
//        return name.toLowerCase();
//    }
}
