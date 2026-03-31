class TravelExpense extends Expense {

    public TravelExpense(String title, double amount) {
        super(title, amount);
    }

    @Override
    public void display() {
        System.out.println("Category: Travel");
        super.display();
    }
}
