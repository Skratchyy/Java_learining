
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberI = Integer.valueOf(scanner.nextLine());
        int numberII = Integer.valueOf(scanner.nextLine());
        System.out.println(Math.sqrt(numberI + numberII));
    }
}

