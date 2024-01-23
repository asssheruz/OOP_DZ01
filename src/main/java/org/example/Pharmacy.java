import java.util.HashSet;
import java.util.Set;

public class Pharmacy {
    private String name;
    private String location;

    public Pharmacy(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Геттеры и сеттеры

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pharmacy pharmacy = (Pharmacy) o;

        if (name != null ? !name.equals(pharmacy.name) : pharmacy.name != null) return false;
        return location != null ? location.equals(pharmacy.location) : pharmacy.location == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Pharmacy> result = new HashSet<>();
        result.add(new Pharmacy("Pharmacy1", "Location1"));
        result.add(new Pharmacy("Pharmacy2", "Location2"));
        result.add(new Pharmacy("Pharmacy1", "Location1")); // Дубликат, не добавится

        System.out.println(result.size()); // Выводит 2, так как только уникальные объекты добавлены в сет
    }
}
