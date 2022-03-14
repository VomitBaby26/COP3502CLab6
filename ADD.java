import java.util.Scanner;

public class Githubthing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dec = 1;
        while (dec != 4) {
            System.out.println("what do you want to do?");
            System.out.println("1. add\n2. nothing");
            dec = scanner.nextInt();
            if (dec == 1) {
                System.out.println("throw in two numbers");
                int add1 = scanner.nextInt();
                int add2 = scanner.nextInt();
                int sum = add1 + add2;
                System.out.println("\nok here it is: " + sum + "\n");
            }
            if (dec == 2) {
                System.out.println("ok");
                System.exit(0);
            }
        }
    }
}