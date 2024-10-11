public class literalex {
    public static void main(String[] args) {
        // Integer Literals
        int dn = 100;
        int bn = 0b1010;
        int oc = 0123;
        int hn = 0x1A;

        // Floating-Point Literals
        float ft = 3.14f;
        double dl = 1.23e2;

        // Boolean Literals
        boolean yep = true;
        boolean nah = false;

        // Character Literals
        char letterA = 'A';
        char newline = '\n';

        // String Literal
        String string = "Hello, World!";

        // Null Literal
        String noValue = null;

        // Numeric Literal with Underscore
        int largeNumber = 1_000_000;

        // Output the literals
        System.out.println("Decimal Number: " +dn);
        System.out.println("Binary Number: " + bn);
        System.out.println("Octal Number: " + oc);
        System.out.println("Hexadecimal Number: " + hn);
        System.out.println("Float Number: " + ft);
        System.out.println("Double Number: " + dl);
        System.out.println("Boolean isActive: " + yep);
        System.out.println("Boolean isComplete: " + nah);
        System.out.println("Character: " + letterA);
        System.out.println("Newline Character: " + newline);
        System.out.println("String: " + string);
        System.out.println("Null Value: " + noValue);
        System.out.println("Large Number with Underscore: " + largeNumber);
    }
}
