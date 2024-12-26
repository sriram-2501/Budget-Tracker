
import java.util.*;

public class BudgetTracker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<String> incomeList = new ArrayList<>();
            List<String> expenseList = new ArrayList<>();
            double totalIncome = 0, totalExpenses = 0;

            while (true) {
                System.out.println("1. Add Income");
                System.out.println("2. Add Expense");
                System.out.println("3. View Summary");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter income source: ");
                        String incomeSource = sc.nextLine();
                        System.out.print("Enter income amount: ");
                        double incomeAmount = sc.nextDouble();
                        sc.nextLine(); // Consume the newline
                        incomeList.add(incomeSource + ": " + incomeAmount);
                        totalIncome += incomeAmount;
                        System.out.println("Income added!");
                        break;

                    case 2:
                        System.out.print("Enter expense category: ");
                        String expenseCategory = sc.nextLine();
                        System.out.print("Enter expense amount: ");
                        double expenseAmount = sc.nextDouble();
                        sc.nextLine(); // Consume the newline
                        expenseList.add(expenseCategory + ": " + expenseAmount);
                        totalExpenses += expenseAmount;
                        System.out.println("Expense added!");
                        break;

                    case 3:
                        System.out.println("\nBudget Summary:");
                        System.out.println("\nIncome:");
                        for (String income : incomeList) {
                            System.out.println(income);
                        }
                        System.out.println("\nExpenses:");
                        for (String expense : expenseList) {
                            System.out.println(expense);
                        }
                        System.out.println("\nTotal Income: " + totalIncome);
                        System.out.println("Total Expenses: " + totalExpenses);
                        System.out.println("Net Balance: " + (totalIncome - totalExpenses));
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}

