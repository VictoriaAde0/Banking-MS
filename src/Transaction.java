public class Transaction {
    private int id;
    private int date;
    private int amount;
    private String transactionType;
    private String description;

    public Transaction() {
    }

//        public Transaction(String id, String date, String amount, String transactionType, String description) {
//        }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getDate() {

        return date;
    }

    public void setDate(int date) {

        this.date = date;
    }

    public int getAmount() {

        return amount;
    }

    public void setAmount(int amount) {

        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {

        this.transactionType = transactionType;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

}
