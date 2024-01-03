package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
            animals.add(new Cat("Барсик"));
            animals.add(new Dog("Белка"));
            animals.add(new Crocodile("Гена"));
            animals.add(new Duck("Дональд"));
            animals.add(new Fish("Немо"));
            animals.add(new Whale("Кон-тики"));

            for (Animal a: animals) a.toGo();
            System.out.println();

            for (Animal a: animals) a.fly();
            System.out.println();

            for (Animal a: animals) a.swim();
            System.out.println();
        }

}
