package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {

        double resultAdd = Calculator.add(5.5, 2.8);
        System.out.println("Addition: " + resultAdd);

        double resultSubtract = Calculator.minus(1.9, 4.3);
        System.out.println("Subtraktion: " + resultSubtract);

        double resultMultiply = Calculator.multiply(10.7, 3.3);
        System.out.println("Multiplikation: " + resultMultiply);

        double resultDivide = Calculator.divide(12.5, 45.3);
        System.out.println("Division: " + resultDivide);
    }
}
