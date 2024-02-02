public class CheckingAccount extends Account {
    private int accountBalance;

    public CheckingAccount(String name, int amount) {
        super(name);
        accountBalance = amount;
    }

    public CheckingAccount(String name) {
        super(name);
        accountBalance = 0;
    }

    public void setKey(int keyNum) {
        super.setKey(keyNum);
    }

    public void lock() {
        super.lock();
    }

    public void unlock() {
        super.unlock();
    }

    public boolean locked() {
        return super.locked();
    }

    public void deposit(int amountIn) {
        accountBalance += amountIn;
        System.out.println(amountIn + " deposited");
    }

    public void withdraw(int amountOut) {
        accountBalance -= amountOut;
        System.out.println(amountOut + " withdrawn");
    }

    public void printBalance() {
        System.out.println(accountBalance);
    }
}
