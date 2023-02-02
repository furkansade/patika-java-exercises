import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double product, kdvRate = 0;

        System.out.print("Ürünün KDV'siz fiyatı: ");
        product = input.nextDouble();

        if (product < 0) {
            System.out.print("Ürün fiyatı negatif olamaz!");
            return;
        } else if (product <= 1000) {
            kdvRate = product * 0.18;
            product *= 1.18;
        } else {
            kdvRate = product * 0.08;
            product *= 1.08;
        }
        
        System.out.printf("Ürünün KDV'li fiyatı: %.2f\n", product);
        System.out.printf("Ürünün KDV'si: %.2f", kdvRate);

    }
}
