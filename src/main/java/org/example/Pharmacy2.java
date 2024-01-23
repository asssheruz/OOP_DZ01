import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pharmacy2 implements Comparable<Pharmacy2> {
    private String name;
    private String location;

    public Pharmacy2(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Геттеры и сеттеры

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pharmacy2 pharmacy = (Pharmacy2) o;

        if (name != null ? !name.equals(pharmacy.name) : pharmacy.name != null) return false;
        return location != null ? location.equals(pharmacy.location) : pharmacy.location == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Pharmacy2 other) {
        // Сравниваем объекты по имени
        return this.name.compareTo(other.name);
    }

    public static void main(String[] args) {
        Set<Pharmacy2> result = new TreeSet<>();
        result.add(new Pharmacy2("Pharmacy1", "Location1"));
        result.add(new Pharmacy2("Pharmacy2", "Location2"));
        result.add(new Pharmacy2("Pharmacy1", "Location1")); // Дубликат, не добавится

        System.out.println(result.size()); // Выводит 2, так как только уникальные объекты добавлены в TreeSet
    }
}