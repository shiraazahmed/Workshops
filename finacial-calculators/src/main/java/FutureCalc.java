import java.util.Scanner;

public class FutureCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deposit amount ($): ");
        double principal = scanner.nextDouble();
        System.out.print("Annual Interest rate (%): ");
        double annualRate = scanner.nextDouble() /100;
        System.out.print("Number of years: ");
        int years = scanner.nextInt();

        double futureValue = principal * Math.pow(1 + (annualRate / 365 ), 365 * years);
        double totalInterest = futureValue - principal;

        System.out.printf("Future value: $%.2f%nTotal Interest Earned: $%.2f%n" , futureValue , totalInterest);

        scanner.close();


    }
}
