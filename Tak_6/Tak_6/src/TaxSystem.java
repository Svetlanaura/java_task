package taxes;

public class TaxSystem {
    public int calcTaxFor(int debit, int credit) {
        return 0;
    }

    public static class UrnIncomeMinusExpensesTaxSystem extends TaxSystem {
        @Override
        public int calcTaxFor(int debit, int credit) {
            // Налог 15% от (доходы - расходы), минимум 0
            int profit = debit - credit;
            return Math.max(0, (int) Math.round(profit * 0.15));
        }
    }

    public static class UrnIncomeTaxSystem extends TaxSystem {
        @Override
        public int calcTaxFor(int debit, int credit) {
            // Налог 6% от доходов
            return Math.max(0, (int) Math.round(debit * 0.06));
        }
    }
}
