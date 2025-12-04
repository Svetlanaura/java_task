package accounts;

public abstract class Account {

    protected long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (this.pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                // откатываем успешный pay, если add не удалось
                this.add(amount);
            }
        }
        return false;
    }
}
