import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int i,j;
        int r = 12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number range: ");

        for(i=1;i<=r;i++){
            for(j=1;j<=12;j++)
                System.out.println(i + " x " + j + " = " + i * j);
            System.out.println("\n");
        }
    }
}