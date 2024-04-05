public class Calculation {

    public static void main(String[] args) {
        calculationTypeSquare(2, 4);
    }

    public static void calculationTypeSquare(int a, int b) {

        String CalculatioType = "Cube";

        if (CalculatioType == "Square") {
            int c = (a * a + b * b + 2 * a * b);
            System.out.println(c);
        } else if (CalculatioType == "Cube") {
            int d = (a*a*a + b*b*b + 3*a*a*b + 3*a*b*b);
            System.out.println(d);
        }
        else {
            System.out.println("Input not valid");
        }
    }
}
