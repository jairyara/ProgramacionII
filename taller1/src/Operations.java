public class Operations {

    public double sum(double numOne, double numTwo) {
        double doSum;
        doSum = numOne + numTwo;
        return doSum;
    }

    public double rest(double numOne, double numTwo) {
        double doRest;
        doRest = numOne - numTwo;
        return doRest;
    }

    public double multiplication(double numOne, double numTwo) {
        double doMultiplication;
        doMultiplication = numOne * numTwo;
        return doMultiplication;
    }

    public double division(double numOne, double numTwo) {
        double doDivision;
        doDivision = numOne / numTwo;
        return doDivision;
    }

    public double settlement(double numOne, double numTwo) {
        double doSettlement;
        // Teniendo en cuenta que la raiz se puede expresar de la forma  x ^ 1/n
        doSettlement = Math.pow(numOne, (1/numTwo));
        return doSettlement;
    }

    public double potency(double base, double exponent) {
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
