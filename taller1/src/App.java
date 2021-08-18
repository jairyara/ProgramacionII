import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    private Operations operations;

    public App() {
        this.operations = new Operations();;
    }

    public void createOperati0ns() throws IOException {
        double numberOne, numberTwo, result;
        String[] names = new String[]{"suma", "resta", "multiplicación", "división", "radicación", "potenciación"};
        String namesCollection = "";
        for (String x : names ) {
            namesCollection += x + " ";
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Calculadora matemática");
        System.out.println("Operaciones básicas ("+ namesCollection + ") de dos números");
        System.out.println("Ingrese un número");
        numberOne = Double.parseDouble(br.readLine());
        System.out.println("Ingrese otro número");
        numberTwo = Double.parseDouble(br.readLine());

        for (int i = 0; i < names.length; i++) {
            switch (i) {
                case 0 -> {
                    result = operations.sum(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
                case 1 -> {
                    result = operations.rest(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
                case 2 -> {
                    result = operations.multiplication(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
                case 3 -> {
                    result = operations.division(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
                case 4 -> {
                    result = operations.settlement(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
                case 5 -> {
                    result = operations.potency(numberOne, numberTwo);
                    System.out.println("El resultado de " + names[i] + " es de " + result);
                }
            }
        }
    }
}
