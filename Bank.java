import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers;
    private List<Account> accounts;
    private List<Transaction> transactions;

    public Bank(String bankName) {
        this.name = bankName;
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void createAccount(Customer customer, double initialBalance) {
        Account account = new Account(customer, initialBalance);
        this.accounts.add(account);
    }

    public void processTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
        }
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Holder: " + account.getCustomer().getName() +
                    ", Balance: $" + account.getBalance());
        }
    }

    public void displayTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println("Transaction: " + transaction.getType() +
                    ", Amount: $" + transaction.getAmount());
        }
    }

    public void run() {
        // Your banking system logic goes here
    }
}
