package taxes;

public class UrnIncomeMinusExpensesTaxSystem extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        // Налог 15% от (доходы - расходы), минимум 0
        int profit = debit - credit;
        return Math.max(0, (int) Math.round(profit * 0.15));
    }
}
