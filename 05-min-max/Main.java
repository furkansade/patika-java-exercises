import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalNum;
        int numbersArrLen, max = 0, min = 0;
        ArrayList<Integer> numbersArr = new ArrayList<Integer>();

        System.out.printf("how many numbers: ");
        totalNum = input.nextInt();

        for (int i = 1; i <= totalNum; i++) {
            System.out.printf("%d. number: ", i);
            int userNumber = input.nextInt();
            numbersArr.add(userNumber);
        }

        Collections.sort(numbersArr);

        numbersArrLen = numbersArr.size();
        
        max = numbersArr.get(numbersArrLen - 1);
        min = numbersArr.get(0);

        System.out.printf("minimum: %d\n", min);
        System.out.printf("maximum: %d", max);
    }
}
