public class Main {
    public static void main(String[] args) {
        System.out.println("\n -------------------START-------------------\n");
        byte a = 11;
        byte b = 5;


        System.out.println("\n ::Arithmetic Operators::\n");
        int sum = a + b;
        int subtr = b - a;
        int multipl = b * a;
        int divis = a / b;
        int rem = a % b;
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + subtr);
        System.out.println("Multiplication = " + multipl);
        System.out.println("Division = " + divis);
        System.out.println("Modulus = " + rem);

        System.out.println("\n ::Unary Operators::\n");
        boolean q = a == b;
        boolean w = a != b;
        boolean e = a > b;
        boolean r = a < b;
        boolean t = a >= b;
        boolean y = a <= b;
        System.out.println("Equal to = " + q);
        System.out.println("Not equal to = " + w);
        System.out.println("Greater than = " + e);
        System.out.println("Less than = " + r);
        System.out.println("Greater than or equal to = " + t);
        System.out.println("Less than or equal to = " + y);

        System.out.println("\n ::Logical Operators::\n");
        boolean tr = true;
        boolean fl = false;
        System.out.println("AND = " + (tr&&fl));
        System.out.println("OR = " + (tr||fl));
        System.out.println("NOT = " + !(tr&&fl));

        System.out.println("\n ::If Else Operator::\n");
        if (a>b)
            System.out.println("          If A > B");
        else
            System.out.println("          Else A < B\n");

        System.out.println("\n ::Stack Overflow::\n");
        byte x = Byte.MAX_VALUE;
        byte c =  2;
        byte add = (byte) (x + c);
        System.out.println("Overflow Sum = " + add);

        System.out.println("\n ::Sum of integer and factorial::\n");
        double k = 2.5;
        System.out.println("Addition = " + (b+k));
        System.out.println("Subtraction = " + (k-b));
        System.out.println("Multiplication = " + (b*k));
        System.out.println("Division = " + (k/b));

        System.out.println("\n -------------------END-------------------\n");

    }
}
