package atm_interface;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
    	if(amount>200000) {
    		System.err.println("Can't deposit more than ₹ 2 Lac!");
    		System.exit(0);
    	}else
    		balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}