import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("your number: ");
        double sum = 1;
        int userNumber = input.nextInt();

        for (double i = userNumber; i > 1; --i) {
            sum += (1 / i);
        }

        System.out.printf("harmonic sum: %.2f", sum);

    }
}
