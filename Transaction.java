public class Transaction {
    private String type;
    private double amount;

    public Transaction(String transactionType, double transactionAmount) {
        this.type = transactionType;
        this.amount = transactionAmount;
    }

    public String getType() {
        return this.type;
    }

    public double getAmount() {
        return this.amount;
    }
}
