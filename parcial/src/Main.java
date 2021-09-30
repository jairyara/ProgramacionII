import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RealEstate property1 = new RealEstate(123, "Cosme", "Fulanito", "Springfield", "Av Siempre Viva", true, 100000, 10000, true);

        property1.setCommission();
        property1.printPropertyInformation();
        System.out.println("--------------------");
        System.out.println("Ingrese el valor disponible para arrendar");

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");

        int value = sc.nextInt();

        property1.verifyRent(value);


    }
}
