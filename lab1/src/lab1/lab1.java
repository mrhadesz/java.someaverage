package lab1;
import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {

        String inputpass, pw = "12345";
        for (int n=1; n<=4 ; n++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input Password ");
            inputpass = sc.next();
            if (inputpass.equals(pw)) {
                System.out.println("Welcome to program");
                break;
            }else {
                System.out.println("Input at " + n + " no current");
            }
        }
    }
}
