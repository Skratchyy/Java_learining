import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberI = Integer.valueOf(scanner.nextLine());
        int numberII = Integer.valueOf(scanner.nextLine());
        if (numberI > numberII) {
            System.out.println(numberI + " is greater than " + numberII + ".");
        } else if (numberI < numberII) {
            System.out.println(numberI + " is smaller than " + numberII + ".");
        } else {
            System.out.println(numberI + " is equal to " + numberII + ".");
        }
    }
}

