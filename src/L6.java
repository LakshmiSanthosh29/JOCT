import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L6
{

    //public class ReadCharExample {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a character: ");
            char character = (char) reader.read();

            System.out.println("You entered: " + character);
        }
   // }
}
