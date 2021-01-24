
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("Enter a year:");
        year = sc.nextInt();
        sc.close();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " IS a leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + " IS a leap year");
        } else {
            System.out.println(year + " IS not a leap year");
        }
        int exp1 = 1, exp2 = 2;
        int result = 8 > 10 ? ++exp1 : ++exp2;
        System.out.println(result);

        String wartosc = zwracaWartosc();
        wartosc = wartosc + 2;
        System.out.println(wartosc);

        nicNieZwraca();
    }

    public static String zwracaWartosc() {
        return "wartosc";
    }

    public static void nicNieZwraca() {
        System.out.println("nic nie zwraca");
    }

    public static int sumNumbers(int[] numbers) {
        numbers[0] = 4;
        numbers[1] = 2;
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }

        return result;
    }
}


