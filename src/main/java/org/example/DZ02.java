package org.example;

public class DZ02 {
    double run();
    }

    public interface Flyable {
        double fly();
    }

    public interface Swimable {
        double swim();
    }

    // Наследники интерфейса Goable
    public class Horse implements Goable {
        @Override
        public double run() {
            System.out.println("Horse is running.");
            return 15.0;
        }
    }

    public class Cheetah implements Goable {
        @Override
        public double run() {
            System.out.println("Cheetah is running.");
            return 70.0;
        }
    }

    // Наследники интерфейса Flyable
    public class Eagle implements Flyable {
        @Override
        public double fly() {
            System.out.println("Eagle is flying.");
            return 50.0;
        }
    }

    public class Butterfly implements Flyable {
        @Override
        public double fly() {
            System.out.println("Butterfly is flying.");
            return 5.0;
        }
    }

    // Наследники интерфейса Swimable
    public class Fish implements Swimable {
        @Override
        public double swim() {
            System.out.println("Fish is swimming.");
            return 10.0;
        }
    }

    public class Duck implements Swimable, Flyable {
        @Override
        public double swim() {
            System.out.println("Duck is swimming.");
            return 8.0;
        }

        @Override
        public double fly() {
            System.out.println("Duck is flying.");
            return 20.0;
        }
    }

// Класс VeterinaryClinic
import java.util.ArrayList;
import java.util.List;

    public class VeterinaryClinic {
        private List<Goable> runningAnimals = new ArrayList<>();
        private List<Swimable> swimmingAnimals = new ArrayList<>();
        private List<Flyable> flyingAnimals = new ArrayList<>();

        private List<Doctor> doctors = new ArrayList<>();
        private List<Nurse> nurses = new ArrayList<>();

        public void addRunningAnimal(Goable animal) {
            runningAnimals.add(animal);
        }

        public void addSwimmingAnimal(Swimable animal) {
            swimmingAnimals.add(animal);
        }

        public void addFlyingAnimal(Flyable animal) {
            flyingAnimals.add(animal);
        }

        public void addDoctor(Doctor doctor) {
            doctors.add(doctor);
        }

        public void addNurse(Nurse nurse) {
            nurses.add(nurse);
        }

        public List<Goable> getAllRunningAnimals() {
            return new ArrayList<>(runningAnimals);
        }

        public List<Swimable> getAllSwimmingAnimals() {
            return new ArrayList<>(swimmingAnimals);
        }

        public List<Flyable> getAllFlyingAnimals() {
            return new ArrayList<>(flyingAnimals);
        }
    }
}
