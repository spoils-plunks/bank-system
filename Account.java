public class Account {
    private Customer customer;
    private double balance;

    public Account(Customer accountHolder, double initialBalance) {
        this.customer = accountHolder;
        this.balance = initialBalance;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }
}
