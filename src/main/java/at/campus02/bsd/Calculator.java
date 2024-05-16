package at.campus02.bsd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double add(double number1, double number2) {
        logger.debug("{} + {}", number1, number2);
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        logger.debug("{} - {}", number1, number2);
        return number1 - number2;
    }

    public static double divide(double number1, double number2) {
        logger.debug("{} / {}", number1, number2);
        if(number2 == 0) {
            logger.error("Divide by zero is not possible");
            throw new ArithmeticException("Divide by zero");
        }
        return number1 / number2;
    }

    public static double multiply(double number1, double number2) {
        logger.debug("{} * {}", number1, number2);
        return number1 * number2;
    }

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
