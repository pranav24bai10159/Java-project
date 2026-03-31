class FoodExpense extends Expense {

    public FoodExpense(String title, double amount) {
        super(title, amount);
    }

    @Override
    public void display() {
        System.out.println("Category: Food");
        super.display();
    }
}
