package org.example;
import java.util.Scanner;

    // Интерфейс для стратегии выполнения операции
    interface Operation {
        ComplexNumber execute(ComplexNumber a, ComplexNumber b);
    }

    // Класс комплексного числа
    class ComplexNumber {
        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        // Геттеры и сеттеры

        @Override
        public String toString() {
            return real + " + " + imaginary + "i";
        }
    }

    // Класс сложения комплексных чисел
    class AdditionOperation implements Operation {
        @Override
        public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
            return new ComplexNumber(a.real + b.real, a.imaginary + b.imaginary);
        }
    }

    // Класс умножения комплексных чисел
    class MultiplicationOperation implements Operation {
        @Override
        public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
            double real = a.real * b.real - a.imaginary * b.imaginary;
            double imaginary = a.real * b.imaginary + a.imaginary * b.real;
            return new ComplexNumber(real, imaginary);
        }
    }

    // Класс деления комплексных чисел
    class DivisionOperation implements Operation {
        @Override
        public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
            double denominator = b.real * b.real + b.imaginary * b.imaginary;
            double real = (a.real * b.real + a.imaginary * b.imaginary) / denominator;
            double imaginary = (a.imaginary * b.real - a.real * b.imaginary) / denominator;
            return new ComplexNumber(real, imaginary);
        }
    }

    // Класс калькулятора
    class ComplexCalculator {
        private Operation operation;

        public ComplexCalculator(Operation operation) {
            this.operation = operation;
        }

        public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
            return operation.execute(a, b);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите комплексное число a (в формате a + bi): ");
            ComplexNumber a = parseComplexNumber(scanner.nextLine());

            System.out.println("Введите комплексное число b (в формате a + bi): ");
            ComplexNumber b = parseComplexNumber(scanner.nextLine());

            System.out.println("Выберите операцию (1 - сложение, 2 - умножение, 3 - деление): ");
            int choice = scanner.nextInt();

            Operation operation = getOperation(choice);
            ComplexCalculator calculator = new ComplexCalculator(operation);

            ComplexNumber result = calculator.calculate(a, b);
            System.out.println("Результат: " + result);
        }

        private static ComplexNumber parseComplexNumber(String input) {
            String[] parts = input.split("\\s*\\+\\s*|\\s*\\-\\s*");
            double realPart = Double.parseDouble(parts[0].trim());
            double imaginaryPart = Double.parseDouble(parts[1].replace("i", "").trim());
            return new ComplexNumber(realPart, imaginaryPart);
        }

        private static Operation getOperation(int choice) {
            switch (choice) {
                case 1:
                    return new AdditionOperation();
                case 2:
                    return new MultiplicationOperation();
                case 3:
                    return new DivisionOperation();
                default:
                    throw new IllegalArgumentException("Неверный выбор операции.");
            }
        }
    }

