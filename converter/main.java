package converter;

import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in decimal system: ");
        BigInteger decNumber = new BigInteger(scanner.nextLine());
        System.out.println("Enter target base: ");
        int targetBase = scanner.nextInt();
        System.out.println("Conversion result: ");
        System.out.println(decNumber.toString(targetBase));

    }
}
