package taxes;

public class UrnIncomeTaxSystem extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        // Налог 6% от доходов
        return Math.max(0, (int) Math.round(debit * 0.06));
    }
}