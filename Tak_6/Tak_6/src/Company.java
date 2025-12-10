import taxes.TaxSystem;

public class Company {
    private String title;
    private int debit;   // доходы
    private int credit;  // расходы
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.debit = 0;
        this.credit = 0;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
        // если amount == 0 — ничего не делаем
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");
        debit = 0;
        credit = 0;
    }

    // Геттеры для тестирования (опционально, но полезно)
    public int getDebit() { return debit; }
    public int getCredit() { return credit; }
}