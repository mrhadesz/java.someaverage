import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("\tScore Evaluation Program");

        System.out.print("Enter your score between 0 - 100: ");
        int score = sn.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("You must enter a correct score, try again later.");
        } else {

            if (score >= 80) {
                System.out.println("Your score is excellent.");
                System.out.println("You grant grade S.");
            } else if (score >= 60) {
                System.out.println("Your score is good.");
                System.out.println("You grant grade A.");
            } else if (score >= 40) {
                System.out.println("Your score is fair.");
                System.out.println("You grant grade B.");
            } else {
                System.out.println("Your score is poor.");
                System.out.println("You grant grade C.");
            }

        }

        /*------------------------------------------*/

        Scanner reader = new Scanner(System.in);

        System.out.println("This is program: ");
        System.out.println("1 Amezon: ");
        System.out.println("2 MK: ");
        System.out.println("3 KFC: ");
        System.out.println("4 Starbug: ");
        System.out.println("เลือก 1-4 : ");
        char ch = reader.next().charAt(0);

        switch (ch) {
            case '1' :
                System.out.println("Amezon OK.");
                break;
            case '2' :
                System.out.println("MK OK.");
                break;
            case '3' :
                System.out.println("KFC OK.");
                break;
            case '4' :
                System.out.println("Starbug OK.");
                break;
            default:
                System.out.println("เลือกเมนูไม่ถูกต้อง");
        }

    }
}