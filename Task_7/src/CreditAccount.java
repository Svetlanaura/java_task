package accounts;

public class CreditAccount extends Account {

    private long creditLimit;

    public CreditAccount(long creditLimit) {
        super(0);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        // На кредитный счёт нельзя уходить в плюс
        if (amount <= 0) return false;
        if (balance + amount > 0) return false;

        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= 0) return false;

        long resultBalance = balance - amount;

        // На кредитном счёте можно уходить в минус, но не больше лимита
        if (resultBalance < -creditLimit) {
            return false;
        }

        balance = resultBalance;
        return true;
    }
}

