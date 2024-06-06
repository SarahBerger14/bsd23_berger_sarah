package at.campus02.bsd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class provides basic arithmetic operations.
 * The operations are added, minus, divide, multiply and factorial.
 * The class also provides logging for each operation.
 */
public class Calculator {

    /**
     * The logger is used to log the operations.
     */
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * This method adds two numbers.
     * @param number1 The first number to add.
     * @param number2 The second number to add.
     * @return The sum of the two numbers.
     */
    public static double add(double number1, double number2) {
        logger.debug("{} + {}", number1, number2);
        return number1 + number2;
    }

    /**
     * This method is for subtraction with two numbers.
     * @param number1 minuet.
     * @param number2 subtrahend.
     * @return The difference of the two numbers.
     */
    public static double minus(double number1, double number2) {
        logger.debug("{} - {}", number1, number2);
        return number1 - number2;
    }

    /**
     * This method divides two numbers.
     * @param number1 The dividend.
     * @param number2 The divisor.
     * @throws ArithmeticException If the divisor is zero.
     * @return The result of the division.
     */
    public static double divide(double number1, double number2) {
        logger.debug("{} / {}", number1, number2);
        if(number2 == 0) {
            logger.error("Divide by zero is not possible");
            throw new ArithmeticException("Divide by zero");
        }
        return number1 / number2;
    }

    /**
     * This method multiplies two numbers.
     * @param number1 The first number to multiply.
     * @param number2 The second number to multiply.
     * @return The product of the two numbers.
     */
    public static double multiply(double number1, double number2) {
        logger.debug("{} * {}", number1, number2);
        return number1 * number2;
    }

    /**
     * This method calculates the factorial of a number. If the number is negative, the result is 0.
     * @param factorial The number for which the factorial is calculated.
     * @return The factorial of the number.
     */
    public static double factorial(double factorial) {
        logger.debug("Factorial of {}", factorial);
        double result = 1;
        double temp = 1;

        if (factorial < 0) {
            return 0;
        } else {
            for (int i = 1; i <= factorial; i++) {
                result = temp * i;
                temp = result;
            }
        }
        return result;
    }
}