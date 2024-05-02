package at.campus02.bsd;

public class Calculator {

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        return number1 - number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double factorial(double factorial) {
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
