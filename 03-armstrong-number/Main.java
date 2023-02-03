import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("your number(positive): ");
        int userNumber = input.nextInt();
        int tempNumber = userNumber, digit = 0;
        double value, counter = 0, sum = 0;


        while (tempNumber != 0) {
            tempNumber /= 10;
            counter++;

        }

        tempNumber = userNumber;

        while (tempNumber != 0) {
            value = tempNumber % 10;
            sum += Math.pow(value, counter);
            tempNumber /= 10;
        }

        String result = (sum == userNumber) ? "your number is armstrong!" : "your number is not armstrong";
        System.out.print(result);

    }
}
