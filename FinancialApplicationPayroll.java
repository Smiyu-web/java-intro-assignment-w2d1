import java.util.Scanner;

public class FinancialApplicationPayroll {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double wage = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federal = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " + wage);

        double grossPay = hours * wage;
        System.out.println("Gross Pay: " + grossPay);

        System.out.println("Deductions:");

        double federalAmount = Math.round(grossPay * federal * 100) / 100d;
        System.out.println("  Federal Withholding (" + federal * 100 + "%): " + federalAmount);

        double stateAmount = Math.round(grossPay * stateTax * 100) / 100d;
        System.out.println("  State Withholding (" + stateTax * 100 + "%): " + stateAmount);

        System.out.println("  Total Deduction: " + (federalAmount + stateAmount));
        System.out.println("Net Pay: " + (grossPay - (federalAmount + stateAmount)));





    }
}
