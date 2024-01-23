public class Animal implements Goable, Swimable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public double run() {
        System.out.println(name + " is running.");
        // Возвращает скорость бега животного
        return 10.0;
    }

    @Override
    public double swim() {
        System.out.println(name + " is swimming.");
        // Возвращает скорость плавания животного
        return 5.0;
    }

    // Другие методы и состояние для класса Animal
}

    public class Bird implements Flyable {
        private String name;

        public Bird(String name) {
            this.name = name;
        }

        @Override
        public double fly() {
            System.out.println(name + " is flying.");
            // Возвращает скорость полета птицы
            return 20.0;
        }

        // Другие методы и состояние для класса Bird
    }
}
