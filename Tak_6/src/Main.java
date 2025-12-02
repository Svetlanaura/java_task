//import taxes.TaxSystem;
import taxes.UrnIncomeTaxSystem;
import taxes.UrnIncomeMinusExpensesTaxSystem;

public class Main {
    public static void main(String[] args) {
        // Создаём компании с разными системами налогообложения
        Company company1 = new Company("ООО Ромашка", new UrnIncomeTaxSystem());
        Company company2 = new Company("ИП Петров", new UrnIncomeMinusExpensesTaxSystem());

        // Тест для УСН "Доходы"
        company1.shiftMoney(100_000);  // доход +100 000
        company1.shiftMoney(-20_000);  // расход +20 000
        company1.payTaxes();           // налог = 6% от 100 000 = 6 000

        // Тест для УСН "Доходы минус расходы"
        company2.shiftMoney(100_000);   // доход
        company2.shiftMoney(-40_000);   // расход
        company2.payTaxes();            // прибыль = 60 000 → налог = 9 000

        // Смена системы налогообложения
        company2.setTaxSystem(new UrnIncomeTaxSystem());
        company2.shiftMoney(50_000);
        company2.shiftMoney(-10_000);
        company2.payTaxes();  // налог = 6% от 50 000 = 3 000
    }
}