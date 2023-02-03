import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perKm = 2.20, customerKm, total;
        int minAmount = 20, startPrice = 10;

        System.out.println("how many kilometers did you travel?");
        customerKm = input.nextDouble();

        if (customerKm <= 0) {
            System.out.print("wrong value!");
            return;
        }

        total = startPrice + (customerKm * perKm);

        total = (total < 20) ? 20 : total;

        System.out.printf("total payment: %.2f$", total);


    }
}
