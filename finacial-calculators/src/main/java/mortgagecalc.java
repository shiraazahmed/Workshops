import java.util.Scanner;

public class mortgagecalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal ($): ");
        double principal = scanner.nextDouble();
        System.out.print("Annual interest rate (%): ");
        double rate = scanner.nextDouble() / 100 /12;
        System.out.print("Loan length (years): ");
        int years = scanner.nextInt(), payment = years * 12;

        double payments = 0;
        double monthlyPayment = (principal * rate) / (1 - Math.pow(1 + rate, -payments));

        double totalPayment = monthlyPayment * payments;
        double totalInterest = totalPayment - principal;

        System.out.printf("Monthly Payment: $%.2f%nTotal Payment: $%.2f%nTotal intrest: $%.2f%n," +
                "monthlyPayment, totalPayment, totalInterest");

        scanner.close();


    }
}
