import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Track transaction history
    public static void printTransactionHistory(List<String> history) {
        System.out.println("\nTransaction History:");
        for (String transaction : history) {
            System.out.println(transaction);
        }
    }

    // Calculate balance
    public static void myBalance(double userIncome, double userExpense) {
        double balance = userIncome - userExpense;
        System.out.printf("Your balance is: $%.2f%n", balance);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        List<String> transactionHistory = new ArrayList<>();

        System.out.print("Enter income: ");
        double userIncome = myObj.nextDouble();
        transactionHistory.add(String.format("Income: $%.2f", userIncome));

        System.out.print("Enter expense: ");
        double userExpense = myObj.nextDouble();
        transactionHistory.add(String.format("Expense: $%.2f", userExpense));

        System.out.printf("Income: $%.2f%n", userIncome);
        System.out.printf("Expense: $%.2f%n", userExpense);

        myBalance(userIncome, userExpense);
        printTransactionHistory(transactionHistory);

        myObj.close();
    }
}
