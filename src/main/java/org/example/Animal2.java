package org.example;

public class Animal2 {
    private String name;

    public Animal2(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " is moving.");
    }
}

    public class FlyingAnimal extends Animal2 {
        public FlyingAnimal(String name) {
            super(name);
        }

        @Override
        public void move() {
            System.out.println(name + " is flying.");
        }
    }

    public class SwimmingRunningAnimal extends Animal2 {
        public SwimmingRunningAnimal(String name) {
            super(name);
        }

        @Override
        public void move() {
            System.out.println(name + " is swimming and running.");
        }
    }


