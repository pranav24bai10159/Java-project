import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Spending");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    System.out.println("Select Category:");
                    System.out.println("1. Food");
                    System.out.println("2. Travel");
                    int type = sc.nextInt();

                    if (type == 1) {
                        expenses.add(new FoodExpense(title, amount));
                    } else if (type == 2) {
                        expenses.add(new TravelExpense(title, amount));
                    } else {
                        System.out.println("Invalid category!");
                    }
                    break;

                case 2:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses recorded.");
                    } else {
                        for (Expense e : expenses) {
                            e.display();
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Expense e : expenses) {
                        total += e.getAmount();
                    }
                    System.out.println("Total Spending: " + total);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
