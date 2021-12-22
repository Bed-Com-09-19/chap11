public class Account {
    protected int id = 0; // my Identity
    protected double balance = 0; // track my balance
    protected double annualInterestRate = 0; // default annual interestrate
    protected java.util.Date dateCreated = new java.util.Date(); // the date of the account creation
    
    // create a non argument constructor
    public Account() {}
    
    // constructor taking arguments
    public Account(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance; // sets another balance
        dateCreated = new java.util.Date(); // date of account creation
    }

    // accessor methods
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualIntrate() {
        return annualInterestRate;
    }

    // mutator methods
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualIntRate(double annualInterestRate) {
        // you devide the annualInterestRate by 100 since its a %
        this.annualInterestRate = annualInterestRate / 100; 
    }

    public String getDate() {
        return dateCreated.toString();
    }
    
    public double getMonthlyIntRate() {
        double monthly = annualInterestRate / 12;
        return monthly;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyIntRate();
    }
}