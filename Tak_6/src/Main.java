
import taxes.UsnIncomeMinusExpenseTax;
import taxes.UsnIncomeTax;

public class Main {

    public static void main(String[] args) {

        Company company = new Company(
                "Ромашка",
                new UsnIncomeTax()
        );

        company.shiftMoney(1_000_000); // доход
        company.shiftMoney(-300_000);  // расход

        company.payTaxes();

        // смена системы налогообложения
        company.setTaxSystem(new UsnIncomeMinusExpenseTax());

        company.shiftMoney(500_000);
        company.shiftMoney(-200_000);

        company.payTaxes();
    }
}
