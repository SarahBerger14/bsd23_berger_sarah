package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        System.out.println("Sarah Berger");

        double resultAdd = Calculator.add(5.5, 2.8);
        System.out.println("Addition: " + resultAdd);

        double resultSubtract = Calculator.minus(1.9, 4.3);
        System.out.println("Subtraktion: " + resultSubtract);

        double resultMultiply = Calculator.multiply(10.7, 3.3);
        System.out.println("Multiplikation: " + resultMultiply);

        double resultDivide = Calculator.divide(12.5, 45.3);
        System.out.println("Division: " + resultDivide);

        logger.info("Hello, this is an info message");
        logger.error("Hello, this is an error message");
    }
}
