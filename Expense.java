class Expense {
    protected String title;
    protected double amount;

    public Expense(String title, double amount) {
        this.title = title;
        this.amount = amount;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Amount: " + amount);
    }

    public double getAmount() {
        return amount;
    }
}
