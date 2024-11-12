package task16th;

public class Exm_Inputs_Arg {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        int max=(a>b)?a:b;
        System.out.println("Maximun number : "+max);

    }
}
