import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        double numberOne, numberTwo, result;
        String[] names = new String[]{"suma", "resta", "multiplicación", "división", "radicación", "potenciación"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Calculadora matemática");
        System.out.println("Operaciones básicas (Suma, resta, multiplicación, división) de dos números");
        System.out.println("Ingrese un número");
        numberOne = Double.parseDouble(br.readLine());
        System.out.println("Ingrese otro número");
        numberTwo = Double.parseDouble(br.readLine());

        for (int i = 0; i < names.length; i++) {
            switch (i) {
                case 0 -> {
                    result = sum(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
                case 1 -> {
                    result = rest(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
                case 2 -> {
                    result = multiplication(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
                case 3 -> {
                    result = division(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
                case 4 -> {
                    result = settlement(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
                case 5 -> {
                    result = potency(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
            }
        }
    }

    public static double sum(double numOne, double numTwo) {
        double doSum;
        doSum = numOne + numTwo;
        return doSum;
    }

    public static double rest(double numOne, double numTwo) {
        double doRest;
        doRest = numOne - numTwo;
        return doRest;
    }

    public static double multiplication(double numOne, double numTwo) {
        double doMultiplication;
        doMultiplication = numOne * numTwo;
        return doMultiplication;
    }

    public static double division(double numOne, double numTwo) {
        double doDivision;
        doDivision = numOne / numTwo;
        return doDivision;
    }

    public static double settlement(double numOne, double numTwo) {
        double doSettlement;
        // Teniendo en cuenta que la raiz se puede expresar de la forma  x ^ 1/n
        doSettlement = Math.pow(numOne, (1/numTwo));
        double x = 1;

        return doSettlement;
    }

    public static double potency(double base, double exponent) {
        double result = 1;
//        Usando Pow
//        result = Math.pow(base, exponent);

        //O sin pow
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }
}
