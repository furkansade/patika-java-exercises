import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float math, phys, chem, turkish, histo, music;

        System.out.print("Matematik: ");
        math = input.nextFloat();

        System.out.print("Fizik: ");
        phys = input.nextFloat();

        System.out.print("Kimya: ");
        chem = input.nextFloat();

        System.out.print("Türkçe: ");
        turkish = input.nextFloat();

        System.out.print("Tarih: ");
        histo = input.nextFloat();

        System.out.print("Müzik: ");
        music = input.nextFloat();

        float total = math + phys + chem + turkish + histo + music;
        float avg = total / 6;

        boolean result = avg >= 60;
        String result2 = result ? "Başarılı!" : "Başarısız!";
        System.out.printf("Ortalamanız: %.2f\nBaşarı durumu: %s", avg, result2);


    }
}
